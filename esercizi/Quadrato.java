package EserciziParte2;

public class Quadrato 
{
	private int lato;
	
	public Quadrato(int lato) 
	{
		this.lato = lato;
	}
	
	public int getPerimetro() { return lato * 4; }
	
	public static void main(String[] args)
	{
		Quadrato quadrato1 = new Quadrato(4);
		System.out.println("Perimetro del quadrato: "+quadrato1.getPerimetro());
	}
}
