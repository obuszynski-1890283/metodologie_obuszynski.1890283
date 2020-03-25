package EserciziParte2;

public class CarattereCentrale 
{
	String parola;
	String carattereCentrale;
	
	public CarattereCentrale(String parola)
	{
		this.parola = parola;
	}
	
	public String estraiCarattereCentrale()
	{
		carattereCentrale = parola.length() % 2 != 1 ? parola.substring(parola.length()/2-1, parola.length()/2+1) : parola.substring(parola.length()/2, parola.length()/2+1);
		return carattereCentrale;
	}
	
	public static void main(String[] args)
	{
		CarattereCentrale parola1 = new CarattereCentrale("magico");
		System.out.println(parola1.estraiCarattereCentrale());
		CarattereCentrale parola2 = new CarattereCentrale("abcde");
		System.out.println(parola2.estraiCarattereCentrale());
	}
}
