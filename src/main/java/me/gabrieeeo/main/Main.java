package me.gabrieeeo.main;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    final private static Timer timer = new Timer();

    public static void main(String[] args) {


        //Agendar tarefa para ser executada a cada 5 segundos
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                //Executar cliques em determinada posição
                try {
                    Robot robot = new Robot();
                    robot.mouseMove(887, 700); //Localização do mouse
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //Pressionar
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //Soltar

                    //Após primeiro clique, seguir segundo clique
                    try {
                        Thread.sleep(500);
                        robot.mouseMove(738, 600); //Localização do mouse
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //Pressionar
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //Soltar
                    }catch (InterruptedException ie) {
                        System.out.println("Ocorreu uma exceção Interrupted: " + ie.getMessage());
                    }

                }catch(AWTException e) {
                    System.out.println("Ocorreu uma exceção AWT: " + e.getMessage());
                }
            }
        },0, 1500);
    }
}
