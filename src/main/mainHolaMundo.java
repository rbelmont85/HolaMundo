package main;

import core.Coche;

public class mainHolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");

		System.out.println("Hola Mundo vero");
		
		Coche coche1 = new Coche(4,4);
		
		System.out.println("El cohce 1 tiene " + coche1.getRuedas() + " ruedas");
		
		System.out.println("El coche 1 tiene " +coche1.getPuertas() + " puertas");
		

	}

}
