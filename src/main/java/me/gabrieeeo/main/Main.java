package me.gabrieeeo.main;

import me.gabrieeeo.mouse.MouseController;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    final private static Timer timer = new Timer();
    private static MouseController mouseController;

    public static void main(String[] args) {

        //Agendar tarefa para ser executada a cada 5 segundos
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                //Executar cliques em determinada posição
                try {
                    mouseController = new MouseController();
                    mouseController.click(887, 700);
                    Thread.sleep(500);
                    mouseController.click(738, 600);
                }catch (InterruptedException e) {
                    System.out.println("Thread error: " + e.getMessage());
                } catch (AWTException e) {
                    System.out.println("Thread merror: " + e.getMessage());
                }
            }
        },0, 1500);
    }
}
