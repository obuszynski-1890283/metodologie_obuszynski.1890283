package EserciziParte2;

public class Cerchio 
{
	private int raggio;
	
	public Cerchio(int raggio)
	{
		this.raggio = raggio;
	}
	
	public Double getCirconferenza() { return 2 * raggio * Math.PI; }
	public Double getArea() { return Math.pow(raggio, 2) * Math.PI; }
	
	public static void main(String [] args)
	{
		Cerchio cerchio1 = new Cerchio(1);
		Cerchio cerchio2 = new Cerchio(5);
		
		System.out.println("Circonferenza: "+cerchio1.getCirconferenza());
		System.out.println("Area: "+cerchio2.getArea());
	}

}
