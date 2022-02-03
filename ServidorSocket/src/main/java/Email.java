/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JEOVÁ JR
 */
public class Email {
    private String emailDestinatario = null;
    private String emailRemetende = null;
    private String conteudoMensagem = null;
    private String assuntoMensagem = null;
    
    public Email(String emailRem,String emailDest,String assuntoEmail,String conteudoEmail){
        this.emailDestinatario = emailDest;
        this.emailRemetende = emailRem;
        this.conteudoMensagem = conteudoEmail;
        this.assuntoMensagem = assuntoEmail;
    }
    
}
