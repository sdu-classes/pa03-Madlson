import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleIO {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ask for input file name
        String inputFileName;
        File inputFile;
        do {
            System.out.print("Enter the name of the input file: ");
            inputFileName = console.nextLine();
            inputFile = new File(inputFileName);
            if (!inputFile.exists()) {
                System.out.println("File not found: " + inputFileName);
            } else if (inputFile.isDirectory()) {
                System.out.println(inputFileName + " is a directory, not a file.");
            }
        } while (!inputFile.exists() || inputFile.isDirectory());

        // ask for output file name
        String outputFileName;
        File outputFile;
        do {
            System.out.print("Enter the name of the output file: ");
            outputFileName = console.nextLine();
            outputFile = new File(outputFileName);
            if (outputFile.isDirectory()) {
                System.out.println(outputFileName + " is a directory, not a file.");
            } else if (inputFile.getAbsolutePath().equals(outputFile.getAbsolutePath())) {
                System.out.println("Output file must be different from input file.");
            }
        } while (outputFile.isDirectory() || inputFile.getAbsolutePath().equals(outputFile.getAbsolutePath()));

        // count "the" occurrences in each line
        try (Scanner input = new Scanner(inputFile);
             PrintWriter output = new PrintWriter(outputFile)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                int count = countOccurrences(line, "the");
                output.println(line + " [" + count + "]");
            }
            System.out.println("Done.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int countOccurrences(String line, String word) {
        int count = 0;
        String[] words = line.toLowerCase().split("\\W+");
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}

