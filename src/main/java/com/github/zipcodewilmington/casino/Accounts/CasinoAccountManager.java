package com.github.zipcodewilmington.casino.Accounts;
import com.github.zipcodewilmington.utils.IOConsole;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Date;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager {
    private Logger accountLogger = Logger.getLogger("New Accounts Log");
    Date date = new Date();
    IOConsole console = new IOConsole();
    SimpleFormatter logFormatter = new SimpleFormatter();
    FileHandler fileHandler;

    {
        try {
            fileHandler = new FileHandler("Casino_Accounts.csv", true);
            accountLogger.addHandler(fileHandler);
            accountLogger.setLevel(Level.INFO);
            fileHandler.setFormatter(logFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount getAccount(String accountName, String accountPassword) {
        return null;
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *
     * @param accountName     name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount createAccount(String accountName, String accountPassword) {
        return null;
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */
    public void registerAccount(CasinoAccount casinoAccount) {
    }
}


