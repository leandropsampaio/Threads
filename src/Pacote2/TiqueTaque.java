/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class TiqueTaque {

    boolean tique;

    public synchronized void tique(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = true;
            notify();
            return;
        }

        System.out.println("- Tique -");

        tique = true;
        notify();

        try {
            while (tique) {
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized void taque(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = false;
            notify();
            return;
        }

        System.out.println("- Taque -");

        tique = false;
        notify();

        try {
            while (tique) {
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
