package EserciziParte2;

import java.util.Random;

public class SalutoCasuale 
{
	String saluto = null;
	
	public void SayHello()
	{
		saluto = switch(new Random().nextInt(5))
		{
			case 0 -> "Ciao";
			case 1 -> "Hello";
			case 2 -> "Buongiornissimo";
			case 3 -> "Salve";
			default -> "Buongiorno";
		};
		System.out.println(saluto);
	}
	
	public static void main(String[] args)
	{
		new SalutoCasuale().SayHello();
	}

}
