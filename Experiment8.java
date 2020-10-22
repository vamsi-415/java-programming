import java.util.Scanner; //experiment 8
import java.util.regex.*;

public class Experiment8 {

	public static boolean isValidUsername(String name) {

		String regex = "^[A-Za-z][A-Za-z0-9_]{5,15}";
		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		return m.matches();
	}

	public static boolean isvalidEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		Pattern p = Pattern.compile(regex);
		if (email == null)
			return false;
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean isValidDate(String date) {
		String regex = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])-(0[1-9]|1[1-2]|[0-9])-([0-9]{4})$";
		Pattern p = Pattern.compile(regex);
		if (date == null)
			return false;
		Matcher m = p.matcher(date);
		return m.matches();
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String username;
		String email;
		String dateofbirth;
		System.out.print("Enter username :");
		username = inp.next();
		System.out.print("Enter email :");
		email = inp.next();
		System.out.print("Enter dateofbirth in dd-mm-yyyy format:");
		dateofbirth = inp.next();
		System.out.println();
		if (isValidUsername(username))
			System.out.println("valid username");
		else
			System.out.println("invalid username");
		if (isvalidEmail(email))
			System.out.println("valid email");
		else
			System.out.println("invalid email");
		if (isValidDate(dateofbirth))
			System.out.println("valid date");
		else
			System.out.println("invalid date");
	}

}
