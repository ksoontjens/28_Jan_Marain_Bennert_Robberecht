public class Main{
	public static void main(String[] args) {
	Werknemer werknemer1 = new Werknemer("Koen", "Danckers", 1, 15);
	Werknemer werknemer2 = new Werknemer("Bert", "Van Hove", 2, 13);
	Werknemer werknemer3 = new Werknemer("Jef", "Peeters", 3, 18);
	Werknemer werknemer4 = new Werknemer("Joris", "Sonck", 4, 12);
	
	werknemer1.salarisVerhogen(10);
	werknemer2.salarisVerhogen(10);
	
	System.out.println(werknemer1.getSalaris());
	System.out.println(werknemer2.getSalaris());
	}
}