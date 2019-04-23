package validacoes;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validacoes {
    
    public static void validarLetras(JTextField validar) {
        validar.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if (((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) && (ch != ' ')) {
                    e.consume();
                }
            }
        });
    }
    
    public static void validarNumeros(JTextField validar) {
        validar.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if (((ch < '0' || ch > '9')) && (ch != ' ')) {
                    e.consume();
                }
            }
        });
    }
}
