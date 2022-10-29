package dat;

import org.jetbrains.annotations.NotNull;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DatWriter {
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
}
