import java.util.*;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		switch(a)
		{
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
		case "Saturday":
			System.out.println("True");
			break;
		case "Sunday":
			System.out.println("False");
			break;
			default:
				System.out.println("Enter only week days");
				
		}

	}

}
