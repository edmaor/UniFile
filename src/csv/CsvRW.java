package csv;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import utils.Cloner;

public class CsvRW {

    private static String removeLastChar(String str){
        return str.substring(0, str.length() - 1);
    }
    public static String objectToCsv(Object o) {
        StringBuilder csvString = new StringBuilder();
        try {
            for (Field f : o.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                csvString.append((String) f.get(o)).append(",");
            }
        } catch ( IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return removeLastChar(csvString.toString());
    }

    public static ArrayList<Object> importCsv (String inputFile, Object importObj){
        try {
            ArrayList<Object> objects = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = br.readLine()) != null){
                Object newObject = Cloner.cloneObject(importObj);
                String[] values = line.split(",");
                int i = 0;
                for (Field f: importObj.getClass().getDeclaredFields()){
                    f.setAccessible(true);
                    Class<?> fieldClass = f.getType();
                    if (fieldClass.equals(String.class)) {
                        f.set(newObject, values[i]);
                    } else if (fieldClass.equals(Boolean.class)) {
                        f.setBoolean(newObject, Boolean.parseBoolean(values[i]));
                    } else if (fieldClass.getSuperclass().equals(Number.class)){
                        if (fieldClass.equals(Integer.class)){
                            f.setInt(newObject, Integer.parseInt(values[i]));
                        } else if (fieldClass.equals(Double.class)){
                            f.setDouble(newObject,Double.parseDouble(values[i]));
                        } else {
                            //TODO: non-primitive types.
                        }
                    }
                    i++;
                }
                objects.add(newObject);
            }
            return objects;
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static void exportToCsv (String outputFile, ArrayList<?> exports){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (Object o: exports){
                bw.write(objectToCsv(o) + '\n');
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}