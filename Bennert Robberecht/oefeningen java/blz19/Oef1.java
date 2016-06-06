import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Oef1
{	
	public static void main(String[] args) {
      Date date1 =
        (new GregorianCalendar
          (1989, Calendar.OCTOBER, 17)).getTime();
      Date date2 = new Date();
      System.out.println
        ("1989-10-17 was a " + sayDayName(date1));
      System.out.println("Today is a " + sayDayName(date2));
    }

    public static String sayDayName(Date d) {
      DateFormat f = new SimpleDateFormat("EEEE");
      try {
        return f.format(d);
      }
      catch(Exception e) {
        e.printStackTrace();
        return "";
      }
    }
}