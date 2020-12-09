package listadecontato;



/**
 *
 * @author davidfernandes
 */

    public class Contato {

        private Contato Prox = null;
        private Contato ant = null;
	private String nome;
	private int celular;
	private int telFixo;
	private String endereco;
        
	
	public Contato(String nome, int celular, int telFixo, String endereco) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.telFixo = telFixo;
		this.endereco = endereco;
                
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public int getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(int telFixo) {
		this.telFixo = telFixo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
        public void setProx(Contato Prox){
            this.Prox = Prox;
        }
        public Contato getProx(){
        return Prox;
        }
        public void setAnt(Contato ant){
            this.ant = ant;
        }
        public Contato getAnt(){
            return ant;
        }
        
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", celular=" + celular + ", telFixo=" + telFixo + ", endereco=" + endereco
				+ "]";
	}
        
        
}

