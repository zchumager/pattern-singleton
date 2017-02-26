package net.me.programming.patterns.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singletonInstance = Singleton.getInstance();
		
		singletonInstance.setSingletonName("Unique instance");
		System.out.println("El nombre de la instancia singleton es : "+singletonInstance.getSingletonName());
		
		
		Singleton otherReferenceToSingletonInstance = Singleton.getInstance();
		System.out.println("El nombre de la instancia singleton es : "+otherReferenceToSingletonInstance.getSingletonName());
	}
}
