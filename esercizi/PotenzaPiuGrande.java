package EserciziParte2;

public class PotenzaPiuGrande 
{
	final int n;
	int val = 1, i = 0;
	
	public PotenzaPiuGrande(int n)
	{
		this.n = n;
	}
	
	public void CalcoloPotenza()
	{
		while(i<=n) 
		{
			val *= 2;
			System.out.println(val);
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		PotenzaPiuGrande p = new PotenzaPiuGrande(4);
		p.CalcoloPotenza();		
	}

}
