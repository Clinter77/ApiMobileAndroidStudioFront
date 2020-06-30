package com.chris.mynewapplication1.controller;
import android.util.Log;

public class Controller {

    private static Controller instance = null;

    public Controller() {
        super();
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public void message() {
        Log.d("Message","Hello");
    }
}
