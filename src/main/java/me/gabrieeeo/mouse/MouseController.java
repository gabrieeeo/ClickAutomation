package me.gabrieeeo.mouse;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseController {

    private static Robot robot;

    public MouseController() throws AWTException {
        robot = new Robot();
    }

    public static void click(int x, int y) {

        robot.mouseMove(887, 700); //Localização do mouse
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //Pressionar
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //Soltar

    }

}
