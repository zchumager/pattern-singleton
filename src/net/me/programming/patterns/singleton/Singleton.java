package net.me.programming.patterns.singleton;

public class Singleton
{
	private static Singleton instance;
	private String name;
	
	
	private Singleton()
	{
		System.out.println("a singleton instance of the "+this.getClass().getSimpleName()+" has been created");
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		
		return instance;
	}
	
	/*
	 * A pesar de que un metodo no estático puede tener acceso a un atributo estático,
	 * el metodo getInstance para crear la instancia se crea estático debido que es la unica manera
	 * para crear la instancia ya que ¿como crearias la instancia? ¿a través de un método no estatico?
	 * pero ¿como le harias si los metodo no estáticos solo se pueden crear a través de un objeto?
	 */
	
	public void setSingletonName(String name)
	{
		instance.name = name;
	}
	
	public String getSingletonName()
	{
		return instance.name;
	}
	
	/*
	 * A pesar de que this, puede ser usado
	 * por convención es mejor acceder a la única instancia que hay
	 * */
}


