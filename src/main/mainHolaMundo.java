package main;

import core.Coche;
import core.Fibonaker;

public class mainHolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> l2 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
    
        System.out.println("Intersection: ");
        l1.stream().filter(l2::contains).forEach(System.out::println);
		
		

	}

}
