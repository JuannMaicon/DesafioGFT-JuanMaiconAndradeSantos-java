package emailFormatado;

class Funcionario {
	
	//Atributos
	private String nomeCompleto, email;
	
    //construtor
	public Funcionario(String nomeCompleto, String email) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
    //get set
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getEmail() {
		return email;
	}
}
