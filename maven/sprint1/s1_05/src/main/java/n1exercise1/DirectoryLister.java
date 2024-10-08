package n1exercise1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DirectoryLister {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter the directory path you want to check:");
            String path = scanner.nextLine();

            try {
                DirectoryHandler directoryHandler = new DirectoryHandler();
                directoryHandler.listFilesSorted(path);
            } catch (FileNotFoundException e) {
                System.err.println("Error: " + e.getMessage());
            }

        } else {
            System.out.println("Please execute this program without arguments. Use it only for command line input.");
        }
    }
}