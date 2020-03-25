package EserciziParte2;

public class Persona 
{
	private String nome;
	private String cognome;
	
	public Persona()  { nome = cognome = "Ignoto"; }
	
	public Persona(String nome, String cognome)
	{
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() { return nome; }
	public String getCognome() { return cognome; }
	
	public static void main(String[] args)
	{
		Persona persona1 = new Persona("Kamil", "Obuszynski");
		Persona persona2 = new Persona();
		
		System.out.println(persona1.getNome()+" "+persona1.getCognome());
		System.out.println(persona2.getNome()+" "+persona2.getCognome());
	}
}

