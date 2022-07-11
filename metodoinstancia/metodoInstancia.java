package metodoinstancia;

public class metodoInstancia {

	public static void main(String[] args) {
		
	Cliente  cliente = new Cliente();
	cliente.primeiroNome = "Miriã";
	cliente.ultimoNome = "Cruz";
	cliente.telefone = "119496-10109";
	cliente.email = "miriam.bk@hotmail.com";
	
	System.out.println("Nome cliente : " +  cliente.obterNomeCompleto());
	System.out.println("Telefone Cliente : " + cliente.telefone +  " Email do Cliente : " + cliente.email);
	
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " "  + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}
	
	}
	
	


