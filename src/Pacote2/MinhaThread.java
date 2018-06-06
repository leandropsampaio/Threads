/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote2;

/**
 *
 * @author Micro
 */
public class MinhaThread implements Runnable{
    
    TiqueTaque tt;
    Thread t;
    
    public MinhaThread(String nome, TiqueTaque tt) {
        this.tt = tt;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        if(t.getName().equalsIgnoreCase("Tique")){
            
        }
    }
    
}
