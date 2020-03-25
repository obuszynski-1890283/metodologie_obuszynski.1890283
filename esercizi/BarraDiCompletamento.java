package EserciziParte2;

public class BarraDiCompletamento 
{
	private int percentuale;
	
	public BarraDiCompletamento( int percentuale )
	{
		this.percentuale = percentuale;
	}
	
	public void incrementa( int incremento )
	{
		this.percentuale = percentuale + incremento;
	}
	
	public String toString()
	{
		return ""+percentuale+"";
	}
	
	public static void main(String[] args)
	{
		BarraDiCompletamento barra = new BarraDiCompletamento(0);
		System.out.println(barra.toString()+"%");
		barra.incrementa(20);
		System.out.println(barra.toString()+"%");
		barra.incrementa(25);
		System.out.println(barra.toString()+"%");
	}
}
