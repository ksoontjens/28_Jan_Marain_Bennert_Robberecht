import java.lang.*;

/**
* De klasse EersteProg is een Java applicatie
*
* @author Joris Sonck
* @version 1,5
*/

public class EersteProg
{
/**
* Dit is een main-functie, hier start het programma, deze functie roept de functie drukaf aan.
* @param args Dit is een array van strings waarmee parameters kunnen meegegeven worden vanaf de commandline.
*/
	
	public static void main(String args[])
	{
		drukaf(75);
	}

	/**
	* Dit is de drukaf-functie, hier word telkens een getal afgedrukt en opgeteld.
	* Hoe dikwijls deze functie word afgedrukt hangt af van de meegegeven parameter.
	* @param m Dit is een int die bepaald hoe dikwijls de for lus word doorlopen.
	*/
	public static void drukaf(int m)
	{
		int a;
		for(a=0;a<m;a++)
		{
			System.out.println(a);
		}
	}
}