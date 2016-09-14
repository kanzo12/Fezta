package Funcionario;

import javax.swing.JOptionPane;

public class Login {
    
    private String senha;
    private String usuario;
    private int n;
    
    public Login(String senha1, String usuario1, int n1)
    {
        setSenha(senha1);
        setUsuario(usuario1);
       setN(n1);
    }

    public Login(String usuario1, int n1)
    {
        setSenha("");
        setUsuario(usuario1);
        setN(n1);
    }
    
    public Login()
    {
        setSenha("");
        setUsuario("");
        setN(0 );
       
    }
    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
   
    public int getN() {
        return n;
    }

  
    public void setN(int n) {
        this.n = n;
    }
    
    
   public static int entra(Funcionario[] funcios, int tam, String senhaDigitada1, String usuarioDigitado1) 
   {
       int n1=-1;
       
       for(int q  = 0; q<tam;q++)
       {
           if(funcios[q].equalsx(usuarioDigitado1,senhaDigitada1))
           {
                
               
                    n1 = funcios[q].getSenhas().getN();
                   
               
           }
       }
       
         if(n1==-1)
           JOptionPane.showMessageDialog(null,  "Senha ou usuário incorreto","Erro de identificação",JOptionPane.WARNING_MESSAGE);
    
       
       return n1;
       
       
       
   }
   
}