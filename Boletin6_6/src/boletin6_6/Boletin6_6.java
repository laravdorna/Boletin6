/*
 * 6- Un almacen clasifica os seus productos según a seguinte táboa de vendas anuais :
Vendas anuais			artigo de consumo
< = 100 productos				baixo
>100 e < = 500				medio
> 500 e < = 100 				alto
> 1000 					primeira necesidade
Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é

 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero de ventas:"));

        if (numVentas <= 100) {
            JOptionPane.showMessageDialog(null, " El articulo es de consumo bajo");
        } else if ( numVentas <= 500) {
            JOptionPane.showMessageDialog(null, " El articulo es de consumo medio");
        } else if ( numVentas <= 1000) {
            JOptionPane.showMessageDialog(null, " El articulo es de consumo alto");
        } else if (numVentas > 1000) {
            JOptionPane.showMessageDialog(null, " El articulo es de primera necesidad");
        }
    }

}
