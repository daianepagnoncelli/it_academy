package n1exercise2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DirectoryLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
