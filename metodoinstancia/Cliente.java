package metodoinstancia;

public class Cliente {
	
	String primeiroNome;
	
	String ultimoNome;
	
	String telefone;
	
	String email;
	
	String obterNomeCompleto() {
		String nomeCompleto = primeiroNome + " "  + ultimoNome;
	
		return nomeCompleto;
	}
}

