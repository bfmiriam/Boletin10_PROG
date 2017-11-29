package boletin10;

import javax.swing.JOptionPane;

public class Xogo {

    private int xogar;
    private int numero;
    private int intento;
    private int i;
    private int num;

    public Xogo() {

    }

    public void executarXogo() {

        int xogar = JOptionPane.showConfirmDialog(null, "¿Quieres jugar?", "Alerta!", JOptionPane.YES_NO_OPTION);

        while (xogar == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "Turno del Jugador 1");

            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un numero entre 1 y 50:"));
            } while (numero > 50 && numero < 0);

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos intentos quieres darle al otro jugador?"));

            JOptionPane.showMessageDialog(null, "Turno del Jugador 2");
            JOptionPane.showMessageDialog(null, "Tienes " + num + " intentos.");

            for (i = 0; i < num; i++) {

                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivina un numero entre 1 y 50:"));

                if (intento < numero) {
                    JOptionPane.showMessageDialog(null, "Prueba con un número mayor!");

                } else if (intento > numero) {
                    JOptionPane.showMessageDialog(null, "Prueba con un número menor!");

                } else {
                    JOptionPane.showMessageDialog(null, "WOW!Has acertado!");
                    break;
                }

            }

            if (intento != numero) {
                JOptionPane.showMessageDialog(null, "Vaya!Parece que se te han acabado los intentos :(");
            }
            xogar = JOptionPane.showConfirmDialog(null, "¿Quieres jugar?", "Alerta!", JOptionPane.YES_NO_OPTION);
        }
        
    }

}
