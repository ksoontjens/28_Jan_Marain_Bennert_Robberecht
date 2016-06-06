public class Main{
	public static void main(String[] args) {
	Werknemer werknemer1 = new Werknemer("Koen", "Danckers", 1, 15);
	Werknemer werknemer2 = new Werknemer("Bert", "Van Hove", 2, 13);
	Werknemer werknemer3 = new Werknemer("Jefke", "Peeters", 3, 18);
	Werknemer werknemer4 = new Werknemer("Joris", "Sonck", 4, 12);
	
	PartTimeWerknemer partTimeWerknemer1 = new PartTimeWerknemer("Jan", "Jansens", 4, 12, 15);
	PartTimeWerknemer partTimeWerknemer2 = new PartTimeWerknemer("Peter", "Peeters", 4, 12, 12);
	
	partTimeWerknemer1.salarisVerhogen(4);
	partTimeWerknemer2.salarisVerhogen(10);
	
	System.out.println(partTimeWerknemer1.getSalaris());
	System.out.println(partTimeWerknemer2.getSalaris());
	}
}