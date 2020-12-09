package listadecontato;


import java.util.Scanner;

/**
 *
 * @author davidfernandes
 */
public class ListaDeContato {

    String e;
    public static void main(String[] args) {
        
        DuplamenteEncadeada d = new DuplamenteEncadeada();
        Scanner escreva = new Scanner(System.in);
        int opcao;
        String nome;
        int celular;
        int telefonefixo;
        String endereco;
        
        
        do{
            System.out.println("Menu Principal");
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Excluir contato");
            System.out.println("[3] Mostrar contatos");
            System.out.println("[0] Fechar lista de contatos");
            System.out.println("Digite a opção deseja: ");
            
            opcao = Integer.parseInt(escreva.nextLine());
            
            switch (opcao){
                case 1: 
                    System.out.println("Digite o nome");
                    nome = escreva.nextLine();
                    
                    System.out.println("Digite o celular");
                    celular = Integer.parseInt(escreva.nextLine());
                    
                    System.out.println("Digite o Telefone fixo");
                    telefonefixo = Integer.parseInt(escreva.nextLine());
                    
                    System.out.println("Digite o endereço");
                    endereco = escreva.nextLine();
                    
                    d.adicionar(nome, celular, telefonefixo, endereco);
                    break;
                case 2: 
                    System.out.println("Digite o nome");
                    nome = escreva.nextLine();
                    d.excluir(nome);
                    break;
                    
                case 3:
                    System.out.println(d.toString());
                    break;
               
            }
            
            System.out.printf("\n\n");
        } while(opcao!=0);
       
}

    
        }
    
    



