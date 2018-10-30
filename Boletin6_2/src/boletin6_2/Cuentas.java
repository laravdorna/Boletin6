/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import javax.swing.JOptionPane;

/**
 * 2- Implementa un programa no que se tecleen dous números de tipo short . Se o
 * primeiro é maior ou igual que o segundo,visualizaremos a resta . En calquera
 * caso visualizaremos a suma .
 *
 *
 * @author lvazquezdorna
 */
public class Cuentas {

    public void operarNum() {
       short num1,num2;

        num1 = Short.parseShort(JOptionPane.showInputDialog("teclea el primer operador: "));
        
        num2 = Short.parseShort(JOptionPane.showInputDialog("teclea el segundo operador: "));
          JOptionPane.showMessageDialog(null, ("SUMA: "+num1 +" + "+num2 +" = " +(num1+num2)));
        if (num1 >=num2) {
            JOptionPane.showMessageDialog(null, ("RESTA: "+num1 +" - "+num2 +" = " + (num1-num2)));
        }

    }
    
    
}
