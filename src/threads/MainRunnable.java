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
 * @author Micro
 */
public class MainRunnable {

    public static void main(String[] args) {
        ThreadRunnable thread1 = new ThreadRunnable("Thread #1", 1000);
        ThreadRunnable thread2 = new ThreadRunnable("Thread #2", 1000);
        ThreadRunnable thread3 = new ThreadRunnable("Thread #3", 1000);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.start(); // Inicia a Thread
        t2.start();
        t3.start();

        try { // Espera as 3 Threads finalizarem para executar o que tem embaixo
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Programa Finalizado!");
    }
}
