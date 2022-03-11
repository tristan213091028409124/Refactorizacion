/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author F
 */
public class NoCambiaLongitud {
    
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    private int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void Visualizar(final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    public void modificar(int[] vector, int posicion, CambiaLongitud cambiaLongitud) {
        int LongitudActual = 0;
        int i;
        //Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            //mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getValor();
        }
        //Mostramos los elementos del array
        cambiaLongitud.Visualizar(longitud, vector);
    }
    //metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    
    
}
