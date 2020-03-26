package EserciziParte2;

public class ContaParole 
{
	String testo, parola;
	int contatore = 0;
	
	public ContaParole(String testo, String parola)
	{
		this.parola = parola;
		this.testo = testo;
	}
	
	public void Conteggio()
	{
		String[] testoDiviso = testo.split(" ");
		for (int i = 0; i < testoDiviso.length; i++)
		{
			if (parola.equals(testoDiviso[i]))
				contatore += 1;
		}
		System.out.println(contatore);
	}
	
	public static void main(String[] args)
	{
		ContaParole p = new ContaParole("ciao ciao bla ciao", "ciao");
		p.Conteggio();
	}
}
