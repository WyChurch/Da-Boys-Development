package src.main;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode();

        switch (code) {
            case KeyEvent.VK_A -> leftPressed = true;
            case KeyEvent.VK_S -> downPressed = true;
            case KeyEvent.VK_D -> rightPressed = true;
            case KeyEvent.VK_W -> upPressed = true;
            default -> {
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int code = e.getKeyCode();

        
        switch (code) {
            case KeyEvent.VK_A -> leftPressed = false;
            case KeyEvent.VK_S -> downPressed = false;
            case KeyEvent.VK_D -> rightPressed = false;
            case KeyEvent.VK_W -> upPressed = false;
            default -> {
            }
        }

    }
    
}
