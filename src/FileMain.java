import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileMain {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        String fileName = "wrong name";
        File file = new File(fileName);

        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
