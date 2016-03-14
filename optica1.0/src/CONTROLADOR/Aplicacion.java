/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ColaCita.Cola;
import MODELO.ColaCita.NodoCola;
import MODELO.DAO.ClienteDAO;
import MODELO.Logica;
import VISTA.*;

/**
 *
 * @author alexisruiz
 */
public class Aplicacion {

    public void iniciarAplicacion() {

        //instancias de las clases unicas, es decir clases que solo se van a utilizar una unica ves
        //a diferencia de una clase 'Persona' la cual podria instanciarse n veces
        Escritorio vistaPrincipal = new Escritorio();
        Login login = new Login(vistaPrincipal, true);
        Cordinador miCordinador = new Cordinador();
        Logica miLogica = new Logica();
        ClienteNuevo VistaNuevoCliente = new ClienteNuevo();
        ClienteDAO miClienteDAO = new ClienteDAO();
        ConsultarCliente miConsultaCliente = new ConsultarCliente();
        AtenderCliente miAtenderCliente = new AtenderCliente();
        Cola miCola = new Cola();

        //Relacionamos las clases con el Cordinador
        vistaPrincipal.setCordinador(miCordinador);//enviamos a la clase Worpace un objeto cordinador
        login.setCordinador(miCordinador);//enviamos a la clase Worpace un objeto cordinador
        miLogica.setCordinador(miCordinador);//enviamos a la clase logica un objeto cordinador
        VistaNuevoCliente.setCordinador(miCordinador);
        miClienteDAO.setCordinador(miCordinador);
        miConsultaCliente.setCordinador(miCordinador);
        miAtenderCliente.setCordinador(miCordinador);
        miCola.setCordinador(miCordinador);

        //Ahora relacionamos el cordinador con las clases
        miCordinador.setVistaPrincipal(vistaPrincipal);
        miCordinador.setMiLogica(miLogica);
        miCordinador.setInicio(login);
        miCordinador.setClienteNuevo(VistaNuevoCliente);
        miCordinador.setClienteDAO(miClienteDAO);
        miCordinador.setMiConsultaCliente(miConsultaCliente);
        miCordinador.setMiAtenderCliente(miAtenderCliente);
        miCordinador.setMiNodo(miCola);
        login.setBounds(200, 100, 610, 420);
        login.setVisible(true);
        vistaPrincipal.setBounds(0, 0, 1360, 700);
        vistaPrincipal.setVisible(true);

    }
}
