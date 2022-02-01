
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JEOVÁ JR
 */
public class Principal extends javax.swing.JFrame {    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            //cria conexao entre cliente e o servidor
            System.out.println("Estabelecendo conexao...");
            Socket socket = new Socket("localhost", 5555); 
            System.out.println("Conexao estabelecida.");

            //para poder manipular o socket, preciso criar streams de entrada e saida
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

                /* Tratar a conversação entre cliente e servidor (tratar protocolo).
                    HELLO
                    nome: string
                    sobrenome : String

                    HELLOREPLY
                    OK, ERRO, PARAMERROR
                    mensagem: String
                */

            Mensagem m = new Mensagem("HELLO");
            m.setStatus(Status.SOLICITACAO);
            m.setParam("nome", "Eduardo");
            m.setParam("sobrenome", "Dipp");

            output.writeObject(m);
            output.flush(); //libera buffer para envio

            System.out.println("Mensagem " + m + " enviada");

            m = (Mensagem) input.readObject();
            System.out.println("Resposta: " + m);

            if(m.getStatus() == Status.OK)
            {
                String reposta = (String) m.getParam("mensagem");
            }

            input.close();
            output.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println("Erro no cliente: " + ex);
            //Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            //Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            System.out.println("Erro no cliente: " + ex.getMessage());
            //Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
