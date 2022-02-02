import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import servidorsocket.Mensagem;

/**
 *
 * @author JEOVÁ JR
 */
public class ServidorSocket {
    public static void main(String[] args){
        try {
            //criamos o servico de escuta
            
            ServerSocket servidor = new ServerSocket(3330);
            System.out.println("Servidor inicializado.");
            
            //criamos o canal de comunicacao para esse servico
            Socket cliente = servidor.accept();
            System.out.println("Cliente do ip: " + cliente.getInetAddress().getHostAddress());
            
            Scanner entrada = new Scanner(cliente.getInputStream());
            while(entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
            }
            
            entrada.close();
            servidor.close();
        } catch (IOException ex) {
            System.out.println("Erroao criar o servidor: " + ex.getMessage());
            
        }
    }
}
