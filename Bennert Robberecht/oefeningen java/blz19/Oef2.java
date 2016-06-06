import java.util.*;

public class Oef2
{	
	public static void main(String[] args) {
	String weekdays[]={"maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
	int weekday = 6;
		for(int i = 1;i<29;i++){
			System.out.println(weekdays[weekday] + " " + i + " februari\n");
			if(weekday==6){
				weekday=0;
			}else{
				weekday++;
			}
		}
	}
}