/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class Calculadora {
    
    private int soma;
    
    public synchronized int somaArray(int[] array) {
        soma = 0;
        
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return soma;
    }
    
}
