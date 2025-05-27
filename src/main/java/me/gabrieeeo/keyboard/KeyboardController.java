package me.gabrieeeo.keyboard;

import java.awt.*;
import java.awt.event.InputEvent;

public class KeyboardController {

    private final Robot robot;

    public KeyboardController() throws AWTException {
        this.robot = new Robot();
    }

    public void clickKey() {
        System.out.println("teste");
    }

}