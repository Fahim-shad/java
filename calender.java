import java.util.Calendar;
public class calender{
public static void main(String[] args){
Calendar calendar = Calendar.getInstance();
int year = calendar.get(Calendar.YEAR);
int month = calendar.get(Calendar.MONTH)+1;
int day = calendar.get(Calendar.DAY_OF_MONTH);
int hour = calendar.get(Calendar.HOUR_OF_DAY);
int minute = calendar.get(Calendar.MINUTE);
 System.out.println("year = " + year);
 System.out.println("month = " + month);
 System.out.println("day = " + day);
System.out.println("hour = " + hour);
System.out.println("minute = " + minute);





























}


}
       