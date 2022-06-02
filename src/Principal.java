
public class Principal {

	public static void main(String[] args) {

		PilhaEncadeada pilha = new PilhaEncadeada();
		
		System.out.println("A pilha está vazia? : " + pilha.estaVazia());
		
		pilha.push("Ana");
		pilha.push("Bruna");
		pilha.push("Carla");
		pilha.push("Daniel");
		
		System.out.println("Total de elementos: " + pilha.quantidadeElementos());
		pilha.exibirElementos();

		pilha.pop();
		System.out.println("Elemento que está no topo: " + pilha.top());

		pilha.exibirElementos();
		System.out.println("Total de elementos: " + pilha.quantidadeElementos());

	}
}