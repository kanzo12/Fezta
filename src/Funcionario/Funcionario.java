
package Funcionario;


import static Funcionario.Login.*;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private double salario;
   
    private Login senhas1 = new Login();
    private LocalDate[] escalamento;
    
    
    private String funcao;
    
    
  
    public Funcionario()
    {
     int i;
    nome = "";
    cpf="";
    telefone="";
    endereco="";
    salario=0;
    funcao="";
    for(i=0; i<=2; i++)
    escalamento[i]=LocalDate.of(12,12,12);
    senhas1.setSenha("");
    senhas1.setUsuario("");
    
    }
    
    public boolean equalsx(String usuarioDigitada, String senhaDigitada)
    {
       if(getSenhas().getUsuario().equals(usuarioDigitada) && getSenhas().getSenha().equals(senhaDigitada))
       return true;
       
       else
       return false;
       
    }
    
    public Funcionario(String nome1, String funcao1, String cpf1,String telefone1,String endereco1,double salario1,LocalDate[] escalamento1, String usuarios1, String senhas1, int n)
    {
        
    this.escalamento=escalamento1;
    this.nome = nome1;
    this.cpf=cpf1;
    this.telefone=telefone1;
    this.endereco=endereco1;
    this.salario=salario1;
    this.funcao=funcao1;
   this.senhas1.setSenha(senhas1);
   this.senhas1.setUsuario(usuarios1);
   this.senhas1.setN(n);
   
    }
 
    
    public String toString()
    {
        String a =  "Nome: "+getNome()+"\nFuncao: "+getFuncao()+"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco();
        a = a + "\nSalario: "+getSalario()+"\n";
        return a;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the senhas
     */
    public Login getSenhas() {
        return senhas1;
    }

    /**
     * @param senhas the senhas to set
     */
    public void setSenhas(Login senhas) {
        this.senhas1 = senhas;
    }

    /**
     * @return the escalamento
     */
    public LocalDate[] getEscalamento() {
        return escalamento;
    }

    /**
     * @param escalamento the escalamento to set
     */
    public void setEscalamento(LocalDate[] escalamento) {
        this.escalamento = escalamento;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public static void trocarSenha(Funcionario[] funcios, int tam, String senhaDigitada1, String usuarioDigitado1)
    {
        int q;
        String novaSenha;
        q = entra(funcios, tam,senhaDigitada1, usuarioDigitado1);
        
        if(q!=-1)
        {
            
            novaSenha = JOptionPane.showInputDialog("DIGITE A NOVA SENHA");
            funcios[q].senhas1.setSenha(novaSenha);
        }
            
    }
    
    
    
    
}
