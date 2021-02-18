package Clase3Ej3;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
//import NoHayPasajesException;

public class Test {

    public static void main(String[] arg) {
        System.out.println("comienzo del dia");

        Vuelo catamarca = new Vuelo("cat", 100);
        Vuelo sanpablo = new Vuelo("sp", 120);
        try {

            catamarca.vender(20);
            // sanpablo.vender(25);
            catamarca.vender(10);
            // sanpablo.vender(33);
            catamarca.vender(17);
            // sanpablo.vender(13);
            catamarca.vender(18);
            sanpablo.vender(10);
            catamarca.vender(37);
            sanpablo.vender(12);
            catamarca.vender(20);

        } catch (NoHayPasajesException npe) {
            System.out.println(
                    "en el vuelo: " + npe.getNombreVuelo() + " quedan: " + npe.getPedido() + " pasajes libre");
        }

        System.out.println(catamarca);
        System.out.println(sanpablo);

        System.out.println("final");

    }

}
