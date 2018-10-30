/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

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
        // crear objetos persona

        Persoa pepe = new Persoa("Pepe", 54);
        Persoa jose = new Persoa("jose", 73.50);
        Persoa juana = new Persoa("juana",65.35);
        Persoa abel = new Persoa("abel", 87.68);
        
      pepe.compararPeso(jose);
      juana.compararPeso(abel);
        

    }

    
}
