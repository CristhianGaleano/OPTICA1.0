/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author alexisruiz
 */
public class Reloj extends Thread{
JLabel reloj;
    public Reloj(JLabel reloj){
        this.reloj=reloj;
    }
    
    @Override
    public void run() {
        while(true){
        Date hoy = new Date();
            SimpleDateFormat formate= new SimpleDateFormat("hh:mm:ss");
            reloj.setText(formate.format(hoy));
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    
}
