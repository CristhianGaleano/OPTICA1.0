
package MODELO.ColaCita;

import CONTROLADOR.Cordinador;

/**
 *
 * @author alexisruiz
 */
public class Cola {
    //creamos atributos de la clase NodoCola y una variable entera para el tamaño
    Cordinador miCordinador;
    NodoCola inicio;
    NodoCola fin;
    int tamano;

    
    //constructor de la clase que inicializa la svariables atributo de la clase NodoCola a null y tamaño a 0
    public Cola() {
        inicio=fin=null;
        tamano=0;
    }
    //METODOS DE LA CLASE COLA INSERTAR,ELIMINAR, MOSTRARINICIO TAMAÑO DE LA COLA VERIFICAR SI ESTA VACIA
    //si esta vacia la cola
    public boolean vaciaCola(){
        return inicio==null;
    }
    
    //inserta un elemento, este metodo recibe el dato a encolar
    public void insertar(String elemento){
        //aqui es donde se crea una instancia de la clase NodoCola
        NodoCola nuevoNodo = new NodoCola(elemento);
        //Verficamos primero a traves del metodo vaciaCola si esta vacia
        if(vaciaCola()){
            //de ser asi, al atributo de la clase NodoCola lo inicializamos con la instancia de la clase NodoCola
            inicio=nuevoNodo;
        }else{
            //atraves del atributo de la clase NodoCola 'fin' accedemos al atributo siguiente al cual le asignamos el valor, recorde
            //mos que esto es el caso si la cola tiene valores
            fin.siguiente=nuevoNodo;
        }
        //en cualquier caso el objeto 'nuevoNodo' lo asignamos a el atributo fin de la clase 'NodoCola'
        fin=nuevoNodo;
        //aumentamos el tamaño en uno
        tamano++;
    }
    
    public String quitar(){
        //el dato ubicado al inicio de la cola se lo asignamos al una variable auxiliar
        String x=inicio.dato;
        //luego cuando es nodo este libre asiganamos el valor del siguiente a ese que ha quedado libre
        inicio=inicio.siguiente;
        //reducimos en uno el tamaño
        tamano--;
        //retornamos el valor quitado
        return x;
    }
    
    //este metodo devuelve el dato guardado al inicio de la cola
    public String inicioCola(){
     return inicio.dato;   
    }
    
    //este metodo devuelve el tamaño d ela cola
    public int tamano(){
        return tamano;
    }

    public void setCordinador(Cordinador miCordinador) {
        this.miCordinador=miCordinador;
    }
    
    
}
