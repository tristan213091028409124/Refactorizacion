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

    public void modificar(int[] vector, int posicion) {
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
vector[posicion] = this.getValor();
        }
//Mostramos los elementos del array
        Visualizar(longitud, vector);
    }
//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] vector) {
        int LongitudActual = 0;
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < longitud) {
            System.out.println("Elemento a borrar=" + vector[p]);
            for (i = p; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
        }
//Mostramos los elementos del array
        Visualizar(longitud, vector);
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los elementos

    public void insertar(int[] vector) {
        int LongitudActual = 0;
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        final int longitud = vector.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > p; i--) {
                vector[i] = vector[i - 1];
            }
            vector[p] = this.getValor();
        }
        Visualizar(longitud, vector);
    }

    public void Visualizar(final int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    
    
}
