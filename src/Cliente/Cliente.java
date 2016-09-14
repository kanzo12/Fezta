
package Cliente;
import java.time.LocalDate;
import Produto.Produtos;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String codigo;
    private LocalDate visita;
    private Produtos[] produtos;
    
    public String toString()
    {
        return "Nome: "+getNome()+"\nCPF: "+getCpf()+"\nCodigo: "+getCodigo();
    }
    
    public Cliente(String nome1, String cpf1, String codigo1,LocalDate visita1)
    {
        nome = nome1;
        cpf = cpf1;
        codigo = codigo1;
       
        visita=visita1;
              
        
    }
   
    public Cliente()
    {
        nome = "";
        cpf = "";
        codigo ="";
        
                
               
    }

   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
    public LocalDate getVisita() {
        return visita;
    }

   
    public void setVisita(LocalDate visita) {
        this.visita = visita;
    }
    
   // public void addConsumo(Produto produtos)
           
 
}
