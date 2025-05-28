package me.gabrieeeo.main;

import com.github.kwhat.jnativehook.GlobalScreen;
import me.gabrieeeo.keyboard.KeyboardController;
import me.gabrieeeo.menu.Menu;
import me.gabrieeeo.mouse.MouseController;

import java.util.Timer;

public class Main {

    final private static Timer timer = new Timer();
    private static MouseController mouseController;

    public static void main(String[] args) {

        //Iniciar 'Menu'
        Menu menu = new Menu();

        //Registrar 'NativeHook'
        try {
            GlobalScreen.registerNativeHook();
        } catch (Exception e) {
            System.out.println("Error register Native Hook: " + e.getMessage());
        }
        GlobalScreen.addNativeKeyListener(new KeyboardController());

        /*
        //Inicializar 'MouseController'
        try {
            mouseController = new MouseController();
        } catch (AWTException e) {
            System.out.println("Error initialize 'MouseController':" + e.getMessage());
            return;
        }

        //Agendar tarefa para ser executada a cada 1.5 segundos
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //Executar cliques em determinada posição
                try {
                    mouseController.click(887, 700);
                    Thread.sleep(500);
                    mouseController.click(738, 600);
                }catch (InterruptedException e) {
                    System.out.println("Thread error: " + e.getMessage());
                }
            }
        },0, 1500);

         */
    }
}
