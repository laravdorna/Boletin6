/*
 *- Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras .
O usuario premerá a opción desexada .Según esta o programa pediralle os datos precisos e, utilizando un switch…case visualizará o resultado .
No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “ opción incorrecta “.
1…. Cadrado
2…. Triangulo
3…. Circulo

 */
package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Inicializar objetos
        Areas area = new Areas();

        //bandera
        System.out.println("Bienvenido a la calculadora de superficies."
                + " que operación desea realizar:");

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //cuadrado
                    area.calcularAreaCuadrado();
                    break;
                case 2:
                    //rectangulo
                    area.calcularAreaRectangulo();
                    break;
                case 3:
                    //triangulo
                    area.calcularAreaTriangulo();
                    break;
                case 4:
                    //circulo
                    area.calcularAreaCirculo();
                    break;
                case 0:
                    System.out.println("\n\t Gracias por usar la calculadora.");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nQue operación desea realizar:"
                + "\n1=>Area del cuadrado"
                + "\n2=>Area del rectangulo"
                + "\n3=>Area del triangulo"
                + "\n4=>Area del circulo"
                + "\n0=>Salir");

        return Integer.parseInt(teclado.nextLine());
    }

}
