

package boletin6_5;

import javax.swing.JOptionPane;

/**
 *5- Dados 3 números que se supon distintos , indicar cal é o maior.
 * @author Lara Vazquez Dorna
 */
public class Boletin6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int mayor;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero 1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero 2:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero 3:"));

        if (num1 > num2) {
            mayor = num1;
        } else if (num3 > num2) {
            mayor = num3;
        } else {
            mayor = num3;
        }

        JOptionPane.showMessageDialog(null, " O maior é :" + mayor);
    }

}
