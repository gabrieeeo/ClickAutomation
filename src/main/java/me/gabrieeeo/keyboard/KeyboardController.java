package me.gabrieeeo.keyboard;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import java.awt.*;
import java.awt.event.InputEvent;

public class KeyboardController implements NativeKeyListener {

    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println("Pressione a letra 'Q' para encerrar a automação.");
        if (e.getKeyCode() == NativeKeyEvent.VC_Q) {
            System.out.println("Você pressionou Q. Encerrando...");
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException ex) {
                System.out.println("Error unregister Native Hook: " + ex.getMessage());
            }
            System.exit(0);
        }
    }
}