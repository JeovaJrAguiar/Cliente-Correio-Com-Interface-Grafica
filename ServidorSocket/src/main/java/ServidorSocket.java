
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JEOVÁ JR
 */
public class ServidorSocket extends javax.swing.JFrame {
    
    private static ServerSocket servidor = null;
    static Socket cliente = null;
    private static Boolean fechaConexao = true;
    private static String ipclient = "    -";
    private static String ipserver = "    -";
    private static String portaServidor = "3367";
    
    /**
     * Creates new form ServidorSocket
     */
    public ServidorSocket() {
        initComponents();
    }
    
    private static int toInt(String portaServidor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private static void closeSocket(Socket socket){
        try {
            fechaConexao = false;
            socket.close();
        } catch (IOException ex) {
            System.out.println("Erro ao  fechar o cliente(Socket).");
            //Logger.getLogger(ServidorSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void getAdderssOfClient(Socket client){
        ipclient = client.getInetAddress().getHostAddress();
    }

    private static void getAdderssOfServer(java.net.ServerSocket server){
        ipserver = server.getInetAddress().getHostAddress();
    }
    
    private static void startServer(){
        /*try {
            int portaservidor = toInt(portaServidor);
            servidor = new ServerSocket(portaservidor);
            
        } catch (IOException ex) {
            System.out.print("Erro ao iniciar servidor: " + ex.getMessage());
            //Logger.getLogger(ServidorSocket.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        while(fechaConexao){
            try {
                System.out.println("--");
                System.out.println("Aguardando conexao.");
                
                servidor = new ServerSocket(3367);
                cliente = servidor.accept();
                System.out.println("Aguardando conexao.");
                System.out.println("Cliente instaciado.");
                                    
                portaServer.setText(portaServidor);
                ipServer.setText("localhost");
                ipClient.setText(cliente.getInetAddress().getHostAddress());
                    if(cliente.getInetAddress().getHostAddress() != null)
                        connection.setText("Conexao estabelecida");
                    
                    getAdderssOfClient(cliente);
                    getAdderssOfServer(servidor);

                    Scanner entrada = new Scanner(cliente.getInputStream());
                    if(entrada.toString() != "R3D3$"){
                        while(entrada.hasNextLine()){
                            System.out.println(entrada.nextLine());
                        }
                    }else{
                        closeSocket(cliente);
                    }
            } catch (IOException ex) {
                System.out.println("Erro ao criar cliente.");
                //Logger.getLogger(ServidorSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            }
        
    }
    
    private static void closeServer(){
        try {
            cliente.close();
            servidor.close();
            
            portaServer.setText("--");
            ipServer.setText("--");
            ipClient.setText("--"); 
            connection.setText("Servidor Desligado");
            
            fechaConexao = false;
        } catch (IOException ex) {
            System.out.println("Erro ao  fechar o servidor(ServerSocket).");
            //Logger.getLogger(ServidorSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getPortaServer(){
        return toInt(portaServidor);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ipServer = new javax.swing.JLabel();
        portaServer = new javax.swing.JLabel();
        ipClient = new javax.swing.JLabel();
        connection = new javax.swing.JLabel();
        startServerButton = new javax.swing.JButton();
        closeServerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente Correio v3.5.1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setText("SERVER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel3.setText("IP do servidor: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setText("Porta: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setText("IP do cliente conectado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setText("Concexão estabelecida: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        ipServer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ipServer.setText("localhost");
        ipServer.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(ipServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, 20));

        portaServer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        portaServer.setText("3367");
        getContentPane().add(portaServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 240, 20));

        ipClient.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ipClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 20));

        connection.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(connection, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 20));

        startServerButton.setText("Inicia Servidor");
        startServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startServerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startServerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        closeServerButton.setText("Fecha Servidor");
        closeServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeServerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeServerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startServerButtonActionPerformed
        fechaConexao = true;
        startServer();
    }//GEN-LAST:event_startServerButtonActionPerformed

    private void closeServerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeServerButtonActionPerformed
        closeServer();
    }//GEN-LAST:event_closeServerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServidorSocket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServidorSocket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServidorSocket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServidorSocket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServidorSocket().setVisible(true);
            }
        });
        
        System.out.println("Tela Criada.");
        startServer();
        /*while(fechaConexao){
            try {
                System.out.println("Aguardando conexao.");
                System.out.println("--");
                
                servidor = new ServerSocket(3367);
                cliente = servidor.accept();
                System.out.println("Aguardando conexao.");
                System.out.println("Cliente instaciado.");
                                    
                portaServer.setText("localhost");
                ipServer.setText(portaServidor);
                ipClient.setText(cliente.getInetAddress().getHostAddress());
                    if(cliente.getInetAddress().getHostAddress() != null)
                        connection.setText("Conexao estabelecida");
                    
                    getAdderssOfClient(cliente);
                    getAdderssOfServer(servidor);

                    Scanner entrada = new Scanner(cliente.getInputStream());
                    if(entrada.toString() != "R3D3$"){
                        while(entrada.hasNextLine()){
                            System.out.println(entrada.nextLine());
                        }
                    }else{
                        closeSocket(cliente);
                    }
            } catch (IOException ex) {
                System.out.println("Erro ao criar cliente.");
                //Logger.getLogger(ServidorSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeServerButton;
    private static javax.swing.JLabel connection;
    private static javax.swing.JLabel ipClient;
    private static javax.swing.JLabel ipServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel portaServer;
    private javax.swing.JButton startServerButton;
    // End of variables declaration//GEN-END:variables
}
