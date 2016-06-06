import java.lang.*;

public class EersteProg
{
	
	public static void main(String args[])
	{
		System.out.println(~10);

		/*
			Alle bits worden geinverteerd.
			In het (2's complement) systeem is er altijd een tekenbit, als deze 1 is word het getal negatief.
			Ook word de werking omgekeerd, de getallen worden aangeduid door 0 i.p.v. 10.
			Echter word in het 2's complement systeem op het einde nog +1 gedaan waardoor het getal negatief -10 word.
			Dit is hier echter niet gebeurd, daardoor is het resultaat -11;
		*/
	}
}