
public class PilhaEncadeada {

	Elemento topo;
	int quantidade = 0;

	public boolean estaVazia() {
		return (topo == null);
	}

	public int quantidadeElementos() {
		return quantidade;
	}

	public String top() {
		if (estaVazia()) {
			return null;
		} else {
			return topo.dado;
		}
	}

	public void push(String novodado) {
		Elemento novo = new Elemento();
		novo.dado = novodado;
		novo.proximo = topo;
		this.topo = novo;
		quantidade++;
	}

	public String pop() {
		if (estaVazia()) {
			return null;
		} else {
			String retorno = topo.dado;
			topo = topo.proximo;
			quantidade--;
			return retorno;
		}

	}

	public void exibirElementos() {
		Elemento auxiliar = this.topo;
		System.out.println("Exibindo elementos do topo até a base: ");
		System.out.println("Topo - início");
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println(auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
		System.out.println("Base - fim");
	}
}
