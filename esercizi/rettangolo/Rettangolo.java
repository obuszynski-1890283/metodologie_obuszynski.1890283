package Rettangolo;
/**
 * 
 * @author Kamil Obuszynski
 *
 */
public class Rettangolo
{
	private int coordinataXBS, coordinataXAS, coordinataXBD, coordinataYBS, coordinataYAS, coordinataYBD, lunghezza, altezza;
	
	public Rettangolo(int coordinataX, int coordinataY, int lunghezza, int altezza) 
	{
		this.coordinataXBS = coordinataX;
		this.coordinataYBS = coordinataY;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}
	
	public void trasla(int coordinataXT, int coordinataYT)
	{
		coordinataXBS += coordinataXT;
		coordinataYBS += coordinataYT;
		
	}
	
	public String toString()
	{
		coordinataXAS = coordinataXBS + altezza; 
		coordinataYAS = coordinataYBS;
		coordinataXBD = coordinataXBS;
		coordinataYBD = coordinataYBS + lunghezza;
		return "(" + ""+coordinataXAS+"" + ", " + ""+coordinataYAS+"" + ")->(" + ""+coordinataXBD+"" + ", " + ""+coordinataYBD+"" + ")";
	}
	
}
