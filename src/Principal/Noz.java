package Principal;

import Funcionario.*;
import Funcionario.Funcionario;
import static Funcionario.Login.entra;

import javax.swing.*;

import java.time.*;

import java.util.Scanner;



public class Noz {

  
    public static void main(String[] args) {
        //Main do projeto;
        
       
   
        Scanner scan = new Scanner(System.in);
        //variaveis uteis  
        String op;
        int op1;
        String nome, cpf, telefone, endereco, funcao,novaSenha, novoUsuario;
        double salario;
        int n = 1;
        LocalDate inicio, fim;
        inicio = fim =  LocalDate.of(12,12,12);
       LocalDate[] escalamento = new LocalDate[2];
       escalamento[0] = inicio;
       escalamento[1] = fim;
         int contaMenu=0;
        Funcionario[] funcio = new Funcionario[n];
        
      
        

    //Menu inicial
        JOptionPane.showMessageDialog(null, "\tSeja bem vindo ao sistema\nEscolha a seguir como desejar entrar");
        op = JOptionPane.showInputDialog(null,"DIGITE COMO DESEJA ENTRAR\n\n1-Gerente\n2-Bar\n3-Caixa\n4-Saída de ingressos\n5-Clientes");
       
      
     
       
        
        switch(op)
        {
                        case "1":
                        {
                           for(int t=0; t<3;t++){
                          System.out.println("1-Cadastra funcionario\n2-re");
                          if(op=="1")
                          {
                            System.out.println("Nome");
                            nome = scan.next();
                            System.out.println("CPF");
                            cpf = scan.next();
                            System.out.println("Funcão");
                            funcao = scan.next();
                            System.out.println("Telefone");
                            telefone = scan.next();
                            System.out.println("Endereço: ");
                            endereco = scan.next();
                             System.out.println("Salário");
                             salario = scan.nextDouble();


                            novoUsuario = JOptionPane.showInputDialog("Digite o nome de usuario desse funcionário");
                            novaSenha = JOptionPane.showInputDialog("Digite a senha desse funcionário");


                           int h =   JOptionPane.showConfirmDialog(null, ("Usuario: "+novoUsuario+"\nSenha: "+novaSenha));

                            if(h == 0)
                           { 
                           JOptionPane.showMessageDialog(null,"Usuario cadastrado");  

                           funcio[0] = new Funcionario(nome, funcao,  cpf, telefone, endereco, salario, escalamento,novoUsuario, novaSenha,n);
                           JOptionPane.showMessageDialog(null, funcio[0].toString());
                           n++;
                           }


                            else if(h==1)
                                System.out.println("Cadastro cancelado");
                          }

                          if(op=="2")//
                          {
                              for(int w=0; w<n; w++)
                              {
                                  System.out.println(funcio[w].toString());
                                  System.out.println("\n\n");
                              }
                          }//

                              }
                              
                              
                              
            }
        }
        
         
        
        
       
       
        
       
        
      
        
      

    }
}/*
   /*
   for(int q = 0; q<tam ;q++){
      

           if(funcio[q].equalsx(usuarioDigitada,senhaDigitada))
           {
             
               
            
               System.out.println(funcio[q].toString());
               System.out.println(q);
               q = tam+1;
               
           }
           else
               System.out.println("erro"
                       + q);
           
       }
    }
      */
      
    
    

