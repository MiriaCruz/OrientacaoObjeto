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
		
			System.out.println("Produto" + produto.nome +  " cont�m :"  +  produto.quantidade + "unidades, precisa repor estoque." );
	} else {
			System.out.println("Produto" + produto.nome +  " cont�m :"  +  produto.quantidade + "unidades, n�o precisa repor estoque." );			
	}
}
}