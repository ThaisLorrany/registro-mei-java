
package agulhasnegras;
import java.util.Date;

public class Cadastros {
    //Atributos
    private int numerocorrida1;
    private String rua1;
    private String complemento1;
    private int numero1;
    private String bairro1;
    private String cidade1;    
    private int dias1;
    private Date data_aluguel1;
    private String horario1;
    private String pagamento1;
    private String nome2;
    private Date nascimento2;
    private String cpf2;
    private String email2;
    private String placa2;
    private String modelo2;
    private String cor2;
    private String cnh2;
    private String celular2;
    private double valor_diaria2;
    private int numeromotorista2;
    private String rua2;
    private String complemento2;
    private int numero2;
    private String bairro2;
    private String cidade2;
    private String nome3;
    private Date nascimento3;
    private String cpf3;
    private String celular3;    
    private String email3;
    private String rua3;
    private String complemento3;
    private int numero3;
    private String bairro3;
    private String cidade3;    

    //Métodos
    public Cadastros() {
    }

    public Cadastros(int p_numerocorrida1,String p_rua1, String p_complemento1, int p_numero1, String p_bairro1, String p_cidade1, int p_dias1, 
            Date p_data_aluguel1,String p_horario1, String p_pagamento1, String p_nome2, Date p_nascimento2, String p_cpf2, String p_email2, 
            String p_placa2, String p_modelo2, String p_cor2, String p_cnh2, String p_celular2, double p_valor_diaria2, int p_numeromotorista2,
            String p_rua2,String p_complemento2, int p_numero2,String p_bairro2, String p_cidade2, String p_nome3, Date p_nascimento3, String p_cpf3,
            String p_celular3, String p_email3,String p_rua3, String p_complemento3, int p_numero3, String p_bairro3, String p_cidade3){
        
        this.numerocorrida1 = p_numerocorrida1;
        this.rua1 = p_rua1;
        this.complemento1 = p_complemento1;
        this.numero1 = p_numero1;
        this.bairro1 = p_bairro1;
        this.cidade1 = p_cidade1;        
        this.dias1 = p_dias1;
        this.data_aluguel1 = p_data_aluguel1;
        this.horario1 = p_horario1;
        this.pagamento1 = p_pagamento1;
        this.nome2 = p_nome2;
        this.nascimento2 = p_nascimento2;
        this.cpf2 = p_cpf2;
        this.email2 = p_email2;
        this.placa2 = p_placa2;
        this.modelo2 = p_modelo2;
        this.cor2 = p_cor2;
        this.cnh2 = p_cnh2;
        this.celular2 = p_celular2;
        this.valor_diaria2 = p_valor_diaria2;
        this.numeromotorista2 = p_numeromotorista2;
        this.rua2 = p_rua2;
        this.complemento2 = p_complemento2;
        this.numero2 = p_numero2;
        this.bairro2 = p_bairro2;
        this.cidade2 = p_cidade2;
        this.nome3 = p_nome3;
        this.nascimento3 = p_nascimento3;
        this.cpf3 = p_cpf3;
        this.celular3 = p_celular3;
        this.email3 = p_email3;
        this.rua3 = p_rua3;
        this.complemento3 = p_complemento3;
        this.numero3 = p_numero3;
        this.bairro3 = p_bairro3;
        this.cidade3 = p_cidade3;
    }    
        //Métodos Get     

    public int getNumerocorrida1() {
        return this.numerocorrida1;
    }
       
    public String getRua1() {
        return this.rua1;
    }

    public String getComplemento1() {
        return this.complemento1;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public String getBairro1() {
        return this.bairro1;
    }

    public String getCidade1() {
        return this.cidade1;
    }

    public int getDias1() {
        return this.dias1;
    }

    public Date getData_aluguel1() {
        return this.data_aluguel1;
    }

    public String getHorario1() {
        return this.horario1;
    }

    public String getPagamento1() {
        return this.pagamento1;
    }

    public String getNome2() {
        return this.nome2;
    }

    public Date getNascimento2() {
        return this.nascimento2;
    }

    public String getCpf2() {
        return this.cpf2;
    }

    public String getEmail2() {
        return this.email2;
    }

    public String getPlaca2() {
        return this.placa2;
    }

    public String getModelo2() {
        return this.modelo2;
    }

    public String getCor2() {
        return this.cor2;
    }

    public String getCnh2() {
        return this.cnh2;
    }

    public String getCelular2() {
        return this.celular2;
    }

    public double getValor_diaria2(){
        return this.valor_diaria2;
    }    
    
    public int getNumeromotorista2() {
        return this.numeromotorista2;
    }
    
    public String getRua2() {
        return this.rua2;
    }

    public String getComplemento2() {
        return this.complemento2;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public String getBairro2() {
        return this.bairro2;
    }

    public String getCidade2() {
        return this.cidade2;
    }

    public String getNome3() {
        return this.nome3;
    }

    public Date getNascimento3() {
        return this.nascimento3;
    }

    public String getCpf3() {
        return this.cpf3;
    }

    public String getCelular3() {
        return this.celular3;
    }

    public String getEmail3() {
        return this.email3;
    }

    public String getRua3() {
        return this.rua3;
    }

    public String getComplemento3() {
        return this.complemento3;
    }

    public int getNumero3() {
        return this.numero3;
    }

    public String getBairro3() {
        return this.bairro3;
    }

    public String getCidade3() {
        return this.cidade3;
    }
    
    //Métodos Set

    public void setNumerocorrida1(int p_numerocorrida1) {
        this.numerocorrida1 = p_numerocorrida1;
    }
    
    public void setRua1(String p_rua1) {
        this.rua1 = p_rua1;
    }

    public void setComplemento1(String p_complemento1) {
        this.complemento1 = p_complemento1;
    }

    public void setNumero1(int p_numero1) {
        this.numero1 = p_numero1;
    }

    public void setBairro1(String p_bairro1) {
        this.bairro1 = p_bairro1;
    }

    public void setCidade1(String p_cidade1) {
        this.cidade1 = p_cidade1;
    }

    public void setDias1(int p_dias1) {
        this.dias1 = p_dias1;
    }

    public void setData_aluguel1(Date p_data_aluguel1) {
        this.data_aluguel1 = p_data_aluguel1;
    }

    public void setHorario1(String p_horario1) {
        this.horario1 = p_horario1;
    }

    public void setPagamento1(String p_pagamento1) {
        this.pagamento1 = p_pagamento1;
    }

    public void setNome2(String p_nome2) {
        this.nome2 = p_nome2;
    }

    public void setNascimento2(Date p_nascimento2) {
        this.nascimento2 = p_nascimento2;
    }

    public void setCpf2(String p_cpf2) {
        this.cpf2 = p_cpf2;
    }

    public void setEmail2(String p_email2) {
        this.email2 = p_email2;
    }

    public void setPlaca2(String p_placa2) {
        this.placa2 = p_placa2;
    }

    public void setModelo2(String p_modelo2) {
        this.modelo2 = p_modelo2;
    }

    public void setCor2(String p_cor2) {
        this.cor2 = p_cor2;
    }

    public void setCnh2(String p_cnh2) {
        this.cnh2 = p_cnh2;
    }

    public void setCelular2(String p_celular2) {
        this.celular2 = p_celular2;
    }
    
    public void setValor_diaria2(double p_valor_diaria2){
        this.valor_diaria2 = p_valor_diaria2;
    }

    public void setNumeromotorista2(int p_numeromotorista2) {
        this.numeromotorista2 = p_numeromotorista2;
    }
    
    public void setRua2(String p_rua2) {
        this.rua2 = p_rua2;
    }

    public void setComplemento2(String p_complemento2) {
        this.complemento2 = p_complemento2;
    }

    public void setNumero2(int p_numero2) {
        this.numero2 = p_numero2;
    }

    public void setBairro2(String p_bairro2) {
        this.bairro2 = p_bairro2;
    }

    public void setCidade2(String p_cidade2) {
        this.cidade2 = p_cidade2;
    }

    public void setNome3(String p_nome3) {
        this.nome3 = p_nome3;
    }

    public void setNascimento3(Date p_nascimento3) {
        this.nascimento3 = p_nascimento3;
    }

    public void setCpf3(String p_cpf3) {
        this.cpf3 = p_cpf3;
    }

    public void setCelular3(String p_celular3) {
        this.celular3 = p_celular3;
    }

    public void setEmail3(String p_email3) {
        this.email3 = p_email3;
    }

    public void setRua3(String p_rua3) {
        this.rua3 = p_rua3;
    }

    public void setComplemento3(String p_complemento3) {
        this.complemento3 = p_complemento3;
    }

    public void setNumero3(int p_numero3) {
        this.numero3 = p_numero3;
    }

    public void setBairro3(String p_bairro3) {
        this.bairro3 = p_bairro3;
    }

    public void setCidade3(String p_cidade3) {
        this.cidade3 = p_cidade3;
    }
    
}