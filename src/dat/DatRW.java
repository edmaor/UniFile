package dat;

import java.io.*;
import java.util.ArrayList;

public class DatRW {
    public static ArrayList<Object> importDat(String importFile) {
        Boolean end = true;
        ArrayList<Object> objects = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(importFile));
            while (end) {
                objects.add(ois.readObject());
            }
        } catch (EOFException oofe) {
            end = false;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return objects;
    }

    public static void exportToDat (String outputFile, ArrayList<?> exports){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile));
            for (Object o : exports) {
                oos.writeObject(o);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
