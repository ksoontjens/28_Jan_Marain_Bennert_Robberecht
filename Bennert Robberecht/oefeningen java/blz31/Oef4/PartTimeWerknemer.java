public class PartTimeWerknemer extends Werknemer
{
	public int urenGewerkt;
	
	public PartTimeWerknemer(String voornaam, String achternaam, int nr, float sal, int urengw)
	{
		super(voornaam, achternaam, nr, sal);
		this.urenGewerkt=urengw;
	}
	
	public void salarisVerhogen(int percentage)
	{
		if(percentage>5)
		{
			percentage=0;
			System.out.println("Slechts 5% opslag toegestaan!");
		}else{
			super.salarisVerhogen(percentage);
		}
	}
	
	public float getWeekLoon()
	{
		return this.salaris * (float)this.urenGewerkt;
	}
}