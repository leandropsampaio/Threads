/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.net.*;
import java.io.*;

/**
 *
 * @author Leandro
 */
public class Conexao2 {
    
    private Socket cliente;
    int porta = 9000;
    private final String ip = "127.0.0.1";
    private BufferedReader entrada, teclado;
    private PrintStream saida;
    
    public void iniciar(){
        try {
            cliente = new Socket(ip, porta);
            entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader(
            new InputStreamReader(System.in));
            String tec = teclado.readLine();
            saida = new PrintStream(cliente.getOutputStream());
            saida.println(tec);
            String msg = entrada.readLine();
            System.out.println(msg);
                    
            entrada.close();
            saida.close();
            teclado.close();
            cliente.close();
            System.out.println("FIM...");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
