package Rettangolo;

public class Colore 
{
	private int r, g, b;
	
	
	public Colore(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void setColore(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public String toString()
	{
		if (r > 255 || b < 0 || b > 255 || g < 0 || g > 255)
			return "Errore inserimento valori!";
		return "(" + ""+r+"" + ", " + ""+g+"" + ", " + ""+b+"" + ")";
	}
}
