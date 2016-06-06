import java.util.*;

public class Oef5
{	
	public static void main(String[] args) {
		for(int i = 3; i < 100;i++){
			int ja = 0;
			for(int a = 2; a < i; a++){
				
				if(i%a==0){
					ja++;
				}
			}
			if(ja==0){
				System.out.println(i);
			}
		}
	}
}