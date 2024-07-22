package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		
		// Collections.sort(list); => Mudar para list.sort() usando comparator!!
		
		// list.sort(new MyComparator()); // Segunda forma criando uma classe MyComparator e instanciando dentro do programa principal.
		
		/*
		
		Comparator<Produto> comp = new Comparator<Produto>() {

			@Override
			public int compare(Produto o1, Produto o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);  // Terceira forma: criando uma classe anônima dentro do próprio programa principal.
		
		*/
		
		/*
		
		Comparator<Produto> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		list.sort(comp); // Quarta forma criando uma função Lambda dentro do programa principal que criará a classe abstrata Comparator em cima do Produto
		
		*/
		
		/*
		 *  Quinta forma: Como a função tem somente uma linha é possível simplificar  mais ainda a sintaxe.
		 */
		
		//Comparator<Produto> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); 
		
		//Sexta forma colocar toda a expressão Lambda como argumento da função Sort.
		
		for (Produto p : list) {
			System.out.println(p);
		}
		
		/*
		 * Resumo da aula
		 *• Comparator objeto de classe separada
		 *• Comparator objeto de classe anônima
		 *• Comparator objeto de expressão lambda com chaves
		 *• Comparator objeto de expressão lambda sem chaves
		 *• Comparator expressão lambda "direto no argumento"
		 */
		
		
	}
}

