/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class ThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public ThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + "Contador " + i);
                for (int j = 0; j < 6; j++) {
                System.out.println(nome + "Contador2 " + i);
                Thread.sleep(tempo);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nome + " terminou a execução");
    }

}
