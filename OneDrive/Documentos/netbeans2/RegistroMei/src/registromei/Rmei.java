package registromei;
import java.util.Date;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thais
 */
public class Rmei {
//Atributos
 private String Nome;
 private String Cpf;
 private String Email;
 private String Celular;
 private String Rg;
 private Date Nascimento;
 private String Orgaoemissor;
 private String Ufemissor;
 private String Ocupacaoprincipal;
 private String Ocupacaosencudaria;
 private String Capitalsocial;
 private String Formadeatuacao;
 private String Cep;
 
  public Rmei (){
     
 }
 
  
  //Métodos
  
 public Rmei (String p_Nome,String p_Cpf,String p_Email,String p_Celular,String p_Rg,Date p_Nascimento,String p_Orgaoemissor,String p_Ufemissor,String p_Ocupacaoprincipal,
String p_Ocupacaosencudaria,String p_Capitalsocial,String p_Formadeatuacao,String p_Cep) {
   this.Nome = p_Nome;
 this.Cpf = p_Cpf;
  this.Email = p_Email;
 this.Celular = p_Celular;
this.Rg = p_Rg;
 this.Orgaoemissor = p_Orgaoemissor;
 this.Ufemissor = p_Ufemissor;
 this.Ocupacaoprincipal = p_Ocupacaoprincipal;
 this.Ocupacaosencudaria = p_Ocupacaosencudaria;
 this.Capitalsocial = p_Capitalsocial;
 this.Formadeatuacao = p_Formadeatuacao;
 this.Cep = p_Cep;  
 }

 
 //Métodos Get
 
    public String getNome() {
        return this.Nome;
    }

    public String getCpf() {
        return this.Cpf;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getCelular() {
        return this.Celular;
    }

    public String getRg() {
        return this.Rg;
    }

    public Date getNascimento() {
        return this.Nascimento;
    }
    

    public String getOrgaoemissor() {
        return this.Orgaoemissor;
    }

    public String getUfemissor() {
        return this.Ufemissor;
    }

    public String getOcupacaoprincipal() {
        return this.Ocupacaoprincipal;
    }

    public String getOcupacaosencudaria() {
        return this.Ocupacaosencudaria;
    }

    public String getCapitalsocial() {
        return this.Capitalsocial;
    }

    public String getFormadeatuacao() {
        return this.Formadeatuacao;
    }

    public String getCep() {
        return this.Cep;
    }

    
    //Métodos Set
    
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public void setNascimento(Date p_Nascimento) {
        this.Nascimento = p_Nascimento;
    }
    
    
    
    public void setOrgaoemissor(String p_Orgaoemissor) {
        this.Orgaoemissor = p_Orgaoemissor;
    }

    public void setUfemissor(String p_Ufemissor) {
        this.Ufemissor = p_Ufemissor;
    }

    public void setOcupacaoprincipal(String p_Ocupacaoprincipal) {
        this.Ocupacaoprincipal = p_Ocupacaoprincipal;
    }

    public void setOcupacaosencudaria(String p_Ocupacaosencudaria) {
        this.Ocupacaosencudaria = p_Ocupacaosencudaria;
    }

    public void setCapitalsocial(String p_Capitalsocial) {
        this.Capitalsocial = p_Capitalsocial;
    }

    public void setFormadeatuacao(String p_Formadeatuacao) {
        this.Formadeatuacao = p_Formadeatuacao;
    }

    public void setCep(String p_Cep) {
        this.Cep = p_Cep;
    }
}
 
