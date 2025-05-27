package me.gabrieeeo.main;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() { //Agendar tarefa para ser executada a cada 5 segundos
            @Override
            public void run() {

            }
        },0, 5000);

        /*try {
            Robot robot = new Robot();
        }catch(AWTException e) {
            System.out.println("Ocorreu uma exceção AWT: " + e.getMessage());
        }*/
    }
}
