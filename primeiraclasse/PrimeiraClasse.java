package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto ();
		produto.nome = "Agua";
		produto.quantidade = 11;
		
		exibirQuantidadeEmEstoque(produto);
		
		
	}

	static void exibirQuantidadeEmEstoque(Produto produto) {
		if (produto.quantidade < 10) {
		
			System.out.println("Produto" + produto.nome +  " contém :"  +  produto.quantidade + "unidades, precisa repor estoque." );
	} else {
			System.out.println("Produto" + produto.nome +  " contém :"  +  produto.quantidade + "unidades, não precisa repor estoque." );			
	}
}
}