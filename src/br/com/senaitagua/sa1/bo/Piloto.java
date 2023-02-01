package br.com.senaitagua.sa1.bo;

public class Piloto {
	
	// métodos
		// estruturas
			// seleção
				// if if else e o switch
			// repetição
				// while for e do while
	
	private String nome;
	private int idade;
	//filosofia: Aristoteles
		//George Boole - lógica booleana.
		//0 e 1 (tabelas verdade e teoremas)
		//Raciocínio Lógico

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Boolean verificarAposentadoria() {
		Boolean resp;
		if (idade >= 65) {
			resp = true;
		} else {
			resp = false;
		}
		return resp;
	}

}
