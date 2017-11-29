package boletin10_2;

import javax.swing.JOptionPane;

public class Xogo {

    private int numero;
    private int intento;
    private int numIntentos;
    private int i;
    private int diferencia;
    private int xogar;

    public Xogo() {

    }

    /**
     * Se a distancia entre o número a adivinar e o tecleado é maior de 20  “
     * moi lonxe “ Entre 10 e 20 , ambos incluidos,  lonxe Maior de 10 e menor
     * de 5  preto Menor ou igual de 5  moi preto .
     *
     */
    public void executarXogo() {

        int xogar = JOptionPane.showConfirmDialog(null, "¿Quieres jugar?", "Alerta!", JOptionPane.YES_NO_OPTION);

        while (xogar == JOptionPane.YES_OPTION) {

            numero = (int) (Math.random() * (51 - 1) + 1);

            JOptionPane.showMessageDialog(null, "Vamos a jugar! :)");
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos intentos quieres tener?"));
            JOptionPane.showMessageDialog(null, "Tienes " + numIntentos + " intentos!");

            for (i = 0; i < numIntentos; i++) {

                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivina un numero entre 1 y 50:"));

                if (numero == intento) {
                    JOptionPane.showMessageDialog(null, "Has acertado!");
                    break;

                } else {
                    diferencia = Math.abs(numero - intento);

                    if (diferencia > 20) {
                        JOptionPane.showMessageDialog(null, "Estás muy lejos!");
                    } else if (diferencia <= 20 && diferencia >= 10) {
                        JOptionPane.showMessageDialog(null, "Estás lejos!");
                    } else if (diferencia < 10 && diferencia > 5) {
                        JOptionPane.showMessageDialog(null, "Estás cerca!");
                    } else if (diferencia <= 5) {
                        JOptionPane.showMessageDialog(null, "Estás muy cerca!");
                    }
                }

            }

            if (intento != numero) {
                JOptionPane.showMessageDialog(null, "Vaya!Parece que se te han acabado los intentos :(");

               
            }
            xogar = JOptionPane.showConfirmDialog(null, "¿Quieres jugar?", "Alerta!", JOptionPane.YES_NO_OPTION);
        }
    }

}
