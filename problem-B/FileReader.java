import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static String[] readFile(String filename) throws FileNotFoundException {
        String[] lines = new String[1000];  // max size of String array
        int lineCounter = 0;
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            lines[lineCounter] = scanner.nextLine();
            lineCounter++;
        }
        scanner.close();
        String[] result = new String[lineCounter];
        System.arraycopy(lines, 0, result, 0, lineCounter);
        return result;
    }

    public static void main(String[] args) {
        String filename = "D:\\Education\\Proga\\ProblemB2\\src\\input.txt";
        try {
            String[] lines = readFile(filename);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
