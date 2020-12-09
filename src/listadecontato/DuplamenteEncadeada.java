package listadecontato;

/**
 *
 * @author davidfernandes
 */
public class DuplamenteEncadeada{
Contato inicio = null;
Contato fim = null;
int tamanho =0;

public void adicionar(String nome, int celular, int telefonefixo, String endereco){
if(inicio == null){
    Contato novo = new Contato(nome, celular, telefonefixo, endereco);
    inicio = novo;
    fim = novo;
    tamanho++;
}
else{
    Contato novo = new Contato(nome, celular, telefonefixo, endereco);
    Contato aux;
    aux = inicio;
    for(int i = 0; i < tamanho; i++){
        if(novo.getNome().compareTo(aux.getNome())<0){
            novo.setProx(aux);
            novo.setAnt(aux.getAnt());
            aux.setAnt(novo);
            tamanho++;
            if(i==0){
                inicio = novo;
            }
            break;
        }
        if(novo.getNome().compareTo(aux.getNome())>0){
            if(i == tamanho-1){
                aux.setProx(novo);
                novo.setAnt(aux);
                tamanho++;
                fim = novo;
                break;
            }
            else{
                aux = aux.getProx();
            }
        }
        else{
            System.out.println("Já está na lista!");
            break;
        }
        
    }
}
}

public void excluir(String nome){
    
    Contato remove = new Contato(nome,0,0,null);
    Contato aux = inicio;
    
    for(int i = 0; i< tamanho; i++){
        if(remove.getNome().compareTo(aux.getNome())==0){
            
            if(inicio.equals(fim)){
            inicio = null;
            fim = null;
            tamanho--;
            break;
        }
            else{
                if(inicio.equals(aux)){
                inicio = aux.getProx(); 
            }
                else{
                    aux.getAnt().setProx(aux.getProx());
                }
                if(fim.equals(aux)){
                fim = aux.getAnt();
            }
                else{
                    aux.getProx().setAnt(aux.getAnt());
                }

                tamanho--;
                break;
            }
            
        
        }
        if(remove.getNome().compareTo(aux.getNome())!=0){
            aux = aux.getProx();
        }
    }

}

@Override
public String toString(){
    String contatos = "";
    Contato aux = inicio;
    while(aux != null){
        contatos += "["+aux.getNome()+","+aux.getCelular()+","+aux.getTelFixo()+","+aux.getEndereco()+"]\n";
        aux = aux.getProx();
}
    return contatos;
}

}

    

