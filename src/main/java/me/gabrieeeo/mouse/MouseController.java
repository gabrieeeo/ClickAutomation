package me.gabrieeeo.mouse;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseController {

    private final Robot robot;

    //Construtor da classe chamado automaticamente (Estou adicionando o objeto Robot na classe MouseController)
    public MouseController() throws AWTException {
        this.robot = new Robot();
    }

    public void click(int x, int y) {
        robot.mouseMove(x, y); //Localização do mouse
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //Pressionar
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //Soltar
    }
}
