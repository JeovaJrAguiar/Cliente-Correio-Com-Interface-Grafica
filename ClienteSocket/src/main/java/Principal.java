
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JEOVÁ JR
 */
public class Principal extends javax.swing.JFrame {    
    private static Socket cliente;
    
    public Principal(){
        initComponents();
        iniciaCliente();
    }
    
    private static void enviaMensagem(String mensagem){
        PrintStream saida;
        try {
            saida = new PrintStream(cliente.getOutputStream());
            saida.println(mensagem);
        } catch (IOException ex) {
            System.out.println("Erro ao enviar mensagem.");
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelEnderecoIPServidor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailRemetente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        assuntoMensagem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(mensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 330, 110));

        jButton1.setText("Enviar Mensagem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 20));

        jLabel1.setText("CLIENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel2.setText("Cliente Correio v1.0.4");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setText("Status:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 50, 20));

        jLabel4.setText("Servidor de Correio Local (IP):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        labelEnderecoIPServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelEnderecoIPServidorActionPerformed(evt);
            }
        });
        getContentPane().add(labelEnderecoIPServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        jLabel5.setText("E-mail remetente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        emailRemetente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRemetenteActionPerformed(evt);
            }
        });
        getContentPane().add(emailRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, -1));

        jLabel6.setText("Assunto da mensagem: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        getContentPane().add(assuntoMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, -1));

        jLabel7.setText("Mensagem:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        setSize(new java.awt.Dimension(416, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviaMensagem(mensagem.getText());
        resultado.setText("Msg enviada.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelEnderecoIPServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelEnderecoIPServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEnderecoIPServidorActionPerformed

    private void emailRemetenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRemetenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailRemetenteActionPerformed

    public static void main(String args[]) {

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
    
    private static void iniciaCliente(){
        try {
            cliente = new Socket("localhost", 3341);
            System.out.println("cliente conectado");
        } catch (IOException ex) {
            System.out.println("Erro na concexao com o servidor");
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assuntoMensagem;
    private javax.swing.JTextField emailRemetente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField labelEnderecoIPServidor;
    private javax.swing.JTextField mensagem;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
