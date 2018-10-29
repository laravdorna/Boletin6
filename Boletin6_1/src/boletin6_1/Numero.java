/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

import javax.swing.JOptionPane;

/**
 * 1- codifica un programa que saque, por consola, un número tecleado, sempre
 * que sexa positivo,xunto coa mensaxe “ e positivo “ .
 *
 * @author lvazquezdorna
 */
public class Numero {

    public void evaluarNumeroPositivo() {
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("teclea mun numero: "));
        if (num1 > 0) {
            JOptionPane.showMessageDialog(null, (num1 + " es positivo"));
        }

    }
}
