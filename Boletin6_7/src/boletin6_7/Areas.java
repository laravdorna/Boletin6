/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author lvazquezdorna
 */
public class Areas {

    private double base;
    private double altura;
    private double radio;

    private void pedirBase() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce base:");
        this.base = teclado.nextDouble();
    }

    private void pedirAltura() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura:");
        this.altura = teclado.nextDouble();
    }

    private void pedirRadio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio:");
        this.radio = teclado.nextDouble();
    }

    public void calcularAreaCuadrado() {
        double area;
        pedirBase();
        area = Math.pow(this.base, 2);
        System.out.println("El area del cuadrado de base " + this.base + "es: " + area);
    }

    public void calcularAreaRectangulo() {
        double area;
        pedirBase();
        pedirAltura();
        area = this.base * this.altura;
        System.out.println("El area del rectangulo de base " + this.base + "y altura " + this.altura + " es: " + area);
    }

    public void calcularAreaTriangulo() {
        double area;
        pedirBase();
        pedirAltura();
        area = (this.base * this.altura) / 2;
        System.out.println("El area del triangulo de base " + this.base + "y altura " + this.altura + " es: " + area);
    }

    public void calcularAreaCirculo() {
        double area;
        pedirRadio();
        area = 2 * Math.PI * Math.pow(radio, 2);
         System.out.println("El area del circulo de radio " + this.radio + " es: " + area);
    }
}
