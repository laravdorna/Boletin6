/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 4-Coñecidos o nome e o peso de dúas persoas, queremos escribir os datos da
 * que pesa máis e, a diferenza de peso entre elas .
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // crear objetos persona
//        Persoa p1 = new Persoa();
//        Persoa p2 = new Persoa();
//
//        System.out.println("DATOS DE LA PRIMERA PERSONA:"
//                + "\nNombre:\n");
//        p1.setNombe(teclado.nextLine());
//        System.out.println("\npeso:\n");
//        p1.setPeso(teclado.nextDouble());
//        System.out.println("DATOS DE LA SEGUNDA PERSONA:"
//                + "\nNombre:\n");
//        p2.setNombe(teclado.nextLine());
//        System.out.println("\npeso:\n");
//        p2.setPeso(teclado.nextDouble());
//
//        p1.compararPeso(p2);

//        Persoa pepe = new Persoa("Pepe", 54);
//        Persoa jose = new Persoa("jose", 73.50);
//        Persoa juana = new Persoa("juana",65.35);
//        Persoa abel = new Persoa("abel", 87.68);
//        
//      pepe.compararPeso(jose);
//      juana.compararPeso(abel);
//        
        String nome = JOptionPane.showInputDialog(null, "Introduce o nome da persoa 1:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce o peso da persoa 1:"));

        Persoa persoa1 = new Persoa(nome, peso);

        String nome2 = JOptionPane.showInputDialog(null, "Introduce o nome da persoa 2:");
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce o peso da persoa 2:"));

        Persoa persoa2 = new Persoa(nome2, peso2);

        persoa1.compararPesoPanel(persoa2);
    }

}
