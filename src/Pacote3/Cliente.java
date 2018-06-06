package Pacote3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente extends Thread {

    public static void main(String args[]) {
        try {
            // Cria um Socket conexao passando como parâmetro o ip e a porta do servidor 
            Socket conexao = new Socket("localhost", 40000);
            //cria uma thread que envia a conexao
            Thread t = new Cliente(conexao);
            //inicia o thread
            t.start();
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
    private Socket conexao;

    public Cliente(Socket s) {//recebe o valor do socket enviado na thread
        conexao = s;
    }

    public void run() {
        try {//cria uma printstream para pegar as informacoes enviadas do servidor
            PrintStream saida = new PrintStream(conexao.getOutputStream());
            //cria um bufferedreader para receber informacoes digitadas
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            //escreve uma mensagem ao usuario
            System.out.println("entre com algum digito");
            //digito recebe o valor digitado pelo usuario
            String digito = teclado.readLine();
            //imprime o valor de digito
            saida.println(digito);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            entrada.readLine();
        } catch (IOException e) {
            System.out.println("IOException" + e);
        } finally {
            try {
                conexao.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
