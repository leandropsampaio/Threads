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
public class Conexao {
    
    private ServerSocket server;
    private Socket socket;
    private int porta = 9000;
    
    private BufferedReader entrada;
    private DataOutputStream saida;
    
    public void iniciar(){
        
        try {
            server = new ServerSocket(porta);
            socket = new Socket();
            socket = server.accept();
            
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensagem = entrada.readLine();
            System.out.println(mensagem);
            saida = new DataOutputStream((socket.getOutputStream()));
            saida.writeUTF("FIM!");
            
            socket.close();
        } catch (Exception e) {
        }
    }
}
















