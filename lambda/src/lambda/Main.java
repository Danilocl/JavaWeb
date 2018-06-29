package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");
		Comparator<String> comparador = (s1, s2) -> 
		  Integer.compare(s1.length(), s2.length());
		  
		 palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		 
		 Runnable r = new Runnable() {
		       public void run() {
		            System.out.println("Thread com classer interna!");
		       }
		  };
		  new Thread(r).start();
		  
		  Runnable r2 = () -> System.out.println("Thread com função lambda!");
		  new Thread(r2).start();
		  
		  
	}
}
