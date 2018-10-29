/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import javax.swing.JOptionPane;

/**
 * 3- Teclear un número e sacar por consola o signo “ + “ se o nº é positivo, o
 * signo “ –“ se é negativo e “ 0 “ se é cero .
 *
 * @author lvazquezdorna
 */
public class Numero {

    public void PositivoONegativo() {
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("teclea un numero positivo o negativo: "));

        if (num1 ==0) {
            JOptionPane.showMessageDialog(null, "0");
        } else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, "-");
        } else {
             JOptionPane.showMessageDialog(null, "+");
        }
    }
}
