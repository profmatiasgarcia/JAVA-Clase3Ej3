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

public class Vuelo {

    private String nombre;
    private int cantLugares = 0;

    public Vuelo(String nom, int lug) {
        setNombre(nom);
        setCantLugares(lug);
    }

    public int getCantLugares() {
        return cantLugares;
    }

    public void setCantLugares(int cantLugares) {
        this.cantLugares = cantLugares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void vender(int pas) throws NoHayPasajesException {
        if (cantLugares - pas < 0) {
            throw new NoHayPasajesException(nombre, pas);
        }
        cantLugares -= pas;

    }

    public String toString() {
        return "vuelo: " + nombre + " >> lugares:  " + cantLugares;
    }
}
