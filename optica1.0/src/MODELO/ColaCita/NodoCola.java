
package MODELO.ColaCita;

public class NodoCola {
//creamos variable que contendra el dato a procesar
    String dato;
    //creamos un atributo de la clase 
    NodoCola siguiente;

    //constructor de la clase que recibira una variable de tipo int, la que inicializara a la variable  'dato' seguidamente
    //iniciarizara el atributo de la clase a null
    public NodoCola(String d) {
        this.dato=d;
        siguiente=null;
        
    }
    
    
    
}
