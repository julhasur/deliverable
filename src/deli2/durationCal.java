package deli2;
import java.util.Scanner;
public class durationCal {
	public static void main (String[]args ) {

Scanner scanner = new Scanner(System.in); // create a scanner object

int year1, year2, month1, month2, day1, day2;

// promt for input
System.out.println("Enter the first date: (format -> \"Y M D\")");

// read the 1st input
System.out.println("Year:");
year1 = scanner.nextInt();
System.out.println("Month:");
month1 = scanner.nextInt();
System.out.println("Day:");
day1 = scanner.nextInt();


// promt for input
System.out.println("Enter the second date: (format -> \"Y M D\")");

// read the 2bd input
System.out.println("Year:");
year2 = scanner.nextInt(); 
System.out.print("Month:");
month2 = scanner.nextInt();
System.out.println("Day:");
day2 = scanner.nextInt();



int date1 = (year1 * 365 + month1 * 30) + day1; 
int date2 = (year2 * 365 + month2 * 30) + day2;

int durationdifferance = date2 - date1; 

int year = durationdifferance / 356;
int month = (durationdifferance % 365) / 30;
int day = (durationdifferance % 365) % 30;

System.out.println("Differance is: " + year + "yearn " + month + "month " + day+"day");
}
}




