package refactorizacion;

public class Prueba {

    public int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void modificar(int[] vector) {
        int i;
        int posicion = 1;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < vector.length) {
            ModificaElemento(vector, posicion);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] v) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < v.length) {
            BorraElemento(v, p, i);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los elementos

    public void insertar(int[] v) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < v.length) {
            InsertaElemento(i, v, p);
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }

    void BorraElemento(int[] v, int p, int i) {
        System.out.println("Elemento a borrar=" + v[p]);
        for (i = p; i < v.length - 1; i++) {
            v[i] = v[i + 1];
        }
    }

    void InsertaElemento(int i, int[] v, int p) {
        System.out.println("Elemento a insertar=" + this.valor);
        for (i = v.length - 1; i > p; i--) {
            v[i] = v[i - 1];
        }
        v[p] = this.valor;
    }

    void ModificaElemento(int[] v, int p) {
//mostramos su contenido
        System.out.println("Elemento a modificar=" + v[p]);
        v[p] = this.valor;
    }
}
