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
public class Threads extends Thread {

    private final String nome;
    private final int tempo;

    public Threads(String nome, int tempo) {
        this.tempo = tempo;
        this.nome = nome;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + "Contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nome + " terminou a execução");
    }
}
