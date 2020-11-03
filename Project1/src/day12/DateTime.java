package day12;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate date=LocalDate.now();
System.out.println(date);
LocalTime time=LocalTime.now();
System.out.println(time);
int dd=date.getDayOfMonth();
int mm=date.getMonthValue();
int yy=date.getYear();
System.out.println(date.getMonth());
System.out.printf("%d-%d-%d",dd,mm,yy);

DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");

String Date1=date.format(newPattern);

System.out.println(Date1);
	}

}
