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
 * @author lvazquezdorna
 */
public class Persoa {
private String nombe;
private double peso;

    public Persoa(String nombe, double peso) {
        this.nombe = nombe;
        this.peso = peso;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
public void compararPeso(Persoa p1) {

        if (p1.getPeso() > this.peso) {
            System.out.println(
                    "La persona con mayor peso es " + p1.getNombe()
                    + " con un peso de " + p1.getPeso()
                    + "\nLa diferencia de peso entre ambos es de "
                    + (p1.getPeso() - this.peso)
            );
        } else if (this.peso > p1.getPeso()) {
            System.out.println(
                    "La persona con mayor peso es " + this.nombe
                    + " con un peso de " + this.peso
                    + "\nLa diferencia de peso entre ambos es de "
                    + (this.peso - p1.getPeso())
            );
        } else {
            System.out.println("Las dos personas pesan lo mismo");   
        }
    }

}
