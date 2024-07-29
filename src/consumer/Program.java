package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		
		// Interface Funcional: Consumer
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
	
		/*FORMAS DE EXPRESSÂO LAMBIDAS COM CONSUMER
		
	      list.forEach(new PriceUpdate()); // list.forEach() irá percorrer a lista e adicionar o Consumer
		   em cada elemento da lista. 
		
	      list.forEach(Product ::staticPricedate); // Referencia com método estático.
		
		  list.forEach(Product ::nonStaticPriceUpdate); // Referencia com método não estático. */
		
		 double factor = 1.1; // expressão lambida declarada.
		
		/*Consumer<Product> cons = p ->{ 
			p.setPrice(p.getPrice() * factor);
		};
		list.forEach(cons);// para cada elmento da list irá aplicar o Consumer.*/
		
		list.forEach(p-> p.setPrice(p.getPrice() * factor)); // Expressão lambda inline
		
		list.forEach(System.out:: println); /*forEach() irá percorrer a list, a classe System referencia
		// (::)o método println que irá imprimir a lista.   */
	}
}

/* SAÍDA
Tv,990,00
Mouse,55,00
Tablet,385,55
HD Case,88,99   */
