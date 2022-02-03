
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
    
    private static void enviaEmail(String emailRem,String emailDest,String assuntoEmail,String conteudoEmail){
        PrintStream saida;
        Email email = new Email(emailRem, emailDest, assuntoEmail, conteudoEmail);
        
        try {
            saida = new PrintStream(cliente.getOutputStream());
            saida.println(email);
        } catch (IOException ex) {
            System.out.println("Erro ao enviar mensagem.");
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagem = new javax.swing.JTextField();
        enviaMensagem = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emialRemetente = new javax.swing.JTextField();
        emailDestinatario = new javax.swing.JTextField();
        assunto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensagem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensagemActionPerformed(evt);
            }
        });
        getContentPane().add(mensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 320, 110));

        enviaMensagem.setText("Enviar E-mail");
        enviaMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviaMensagemActionPerformed(evt);
            }
        });
        getContentPane().add(enviaMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 20));

        jLabel1.setText("CLIENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel2.setText("Cliente Correio v3.5.1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setText("Status:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 50, 20));

        jLabel4.setText("Servidor de Correio Local (IP):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel5.setText("E-mail remetente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setText("Assunto da mensagem: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel7.setText("Mensagem:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setText("E-mail destinatário: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("localhost");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, 20));
        getContentPane().add(emialRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 220, -1));
        getContentPane().add(emailDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 210, -1));
        getContentPane().add(assunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, -1));

        setSize(new java.awt.Dimension(416, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviaMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviaMensagemActionPerformed
        String emailRem = emialRemetente.getText();
        String emailDest = emailDestinatario.getText();
        String assuntoEmail = assunto.getText();
        String conteudoEmail = mensagem.getText();
        
        
        enviaEmail(emailRem, emailDest, assuntoEmail, conteudoEmail);
        resultado.setText("Msg enviada.");
    }//GEN-LAST:event_enviaMensagemActionPerformed

    private void mensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensagemActionPerformed

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
            cliente = new Socket("localhost", 3367);
            System.out.println("cliente conectado");
        } catch (IOException ex) {
            System.out.println("Erro na concexao com o servidor");
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assunto;
    private javax.swing.JTextField emailDestinatario;
    private javax.swing.JTextField emialRemetente;
    private javax.swing.JButton enviaMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mensagem;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
