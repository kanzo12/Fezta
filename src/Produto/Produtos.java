
package Produto;

public class Produtos {
 
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;
    Produtos(String nome1, String codigo1, double preco1, int quantidade1)
    {
        nome = nome1;
        codigo = codigo1;
        preco = preco1;
        quantidade = quantidade1;
    }

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public double getPreco() {
        return preco;
    }

   
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
