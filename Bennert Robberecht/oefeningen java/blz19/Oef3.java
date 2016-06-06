import java.util.*;

public class Oef3
{	
	public static void main(String[] args) {
	double haakjes = 1;
	int a = 0;
		for(double i = 3; i<40000; i+=4){
			haakjes = haakjes - (1/i) + (1/(i+2));
		}
		System.out.println((4*haakjes));
	}
}