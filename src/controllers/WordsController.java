/*
 /*
 * File: WordsController.java
 * Created Date: 2021-09-24 10:39:45
 * Author: Rorhacher Marcell
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2021-09-24
 * Modified By: Rohrbacher Marcell
 * -----
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package controllers;

import views.MainWindow;

public class WordsController {
    MainWindow mainWindow;
    //Az osztály konstruktora
    public WordsController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitButton.addActionListener(event ->{
            System.exit(0);
        });
    }
    
}

/**
 * 2021-09-24 Kezdés
 * 2021-09-26 Szemetelés
 */