package Rettangolo;

public class TestRettangolo 
{
	public static void main(String[] args)
	{
		Rettangolo rettangolo = new Rettangolo(0, 0, 20, 10);
		Colore coloreRettangolo = new Colore(0, 0, 0);
		System.out.println("Colore del rettangolo: " + coloreRettangolo.toString());
		System.out.println("Posizione del rettangolo: " + rettangolo.toString());
		
		rettangolo.trasla(-5, 10);
		coloreRettangolo.setColore(45, 26, 89);
		System.out.println("Colore del rettangolo: " + coloreRettangolo.toString());
		System.out.println("Posizione del rettangolo: " + rettangolo.toString());
		
		coloreRettangolo.setColore(445, 262, 517);
		System.out.println("Colore del rettangolo: " + coloreRettangolo.toString());
		
	}
}
