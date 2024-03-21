package com.github.zipcodewilmington.utils;
import com.github.zipcodewilmington.casino.Accounts.CasinoAccount;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.io.FileWriter;

public class FileReader {
    static File testFile = new File("src/main/java/com/github/zipcodewilmington/casino/Accounts/TestAccountFile.csv");

    public static boolean readFile(String userName, String passWord) throws FileNotFoundException {
        boolean isInCSV = false;

        try {

            Scanner fileIn = new Scanner(testFile);

            while (fileIn.hasNext()) {
                String lineIn = fileIn.nextLine();
                String[] temp = lineIn.split(",");
                    if (temp[0].equals(userName) && temp[1].equals(passWord)) {
                        isInCSV = true;
                    }
                }
            fileIn.close();
                // check to see if account data is different on file than what is stored in mainMenu.
                // if so, update account information with most recent file data
        } catch(IOException e) {
            System.out.println("File not found.");
        }
        return isInCSV;
    }

    public void writeFile(CasinoAccount newAccount) throws FileNotFoundException {
        boolean append = true;
        try {
            FileWriter fileWriter = new FileWriter(testFile, append);
            BufferedWriter fileOut = new BufferedWriter(fileWriter);
            String accountName = newAccount.getAccountName();
            String accountPassword = newAccount.getAccountPassword();
            String lineIn = accountName + "," + accountPassword + "," + 0.0;

            fileOut.newLine();
            fileOut.append(lineIn);

            fileOut.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

}
