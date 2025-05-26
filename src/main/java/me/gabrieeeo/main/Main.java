package me.gabrieeeo.main;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
        }catch(AWTException e) {
            System.out.println("Ocorreu uma exceção AWT: " + e.getMessage());
        }
    }

}
