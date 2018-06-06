/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Leandro
 */
public class Main {
    
    public static void main(String[] args) {
        Threads novaThread = new Threads("THREAD (1)", 1000);
        
        Threads novaThread2 = new Threads("THREAD (2)", 1000);
    }
}
