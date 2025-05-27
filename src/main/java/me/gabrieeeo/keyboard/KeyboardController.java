package me.gabrieeeo.keyboard;

import java.awt.*;

public class KeyboardController {

    private final Robot robot;

    public KeyboardController() throws AWTException {
        this.robot = new Robot();
    }
}
