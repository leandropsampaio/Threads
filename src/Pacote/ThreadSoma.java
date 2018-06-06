/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

/**
 *
 * @author Micro
 */
public class ThreadSoma implements Runnable {

    private String nome;
    private int[] numeros;
    Calculadora cal = new Calculadora();

    public ThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome+" Iniciada!");
        
        int soma = cal.somaArray(this.numeros);
        
        System.out.println("O resultado da soma para"+this.nome+" é: "+ soma);
        System.out.println(this.nome+" Finalizada!");
    }
}
