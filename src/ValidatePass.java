import java.util.Scanner;

public class ValidatePass {

	public static void main(String[] args) {
		System.out.println("Password must include the following:");
		System.out.println("At least one lowercase letter");
		System.out.println("At least one uppercase letter");
		System.out.println("A minimum of 7 characters");
		System.out.println("A maximum of 12 characters");
		System.out.println("An exclamation point: !");
		boolean passwordSuccess = true;
		Scanner in = new Scanner(System.in);
		System.out.print("Create your password: ");
		String password = in.nextLine();
		int passwordLength = password.length();
		if (!checkIfPassswordContainsLower(password)) {
			passwordSuccess = false;
		}
		if (!checkIfPassswordContainsUpper(password)) {
			passwordSuccess = false;
		}
		if (!(passwordLength >= 7 && passwordLength <= 12)) {
			passwordSuccess = false;
		}
		if (!password.contains("!")) {
			passwordSuccess = false;
		}
		if (passwordSuccess) {
			System.out.println("Password valid and accepted");
		} else {
			System.out.println("Error");
		}
	}

	private static boolean checkIfPassswordContainsLower(String password) {
		char currentCharacter;
		boolean checkContains = false;
		for (int i = 0; i < password.length(); i++) {
			currentCharacter = password.charAt(i);
			if (Character.isLowerCase(currentCharacter))
				checkContains = true;
		}
		return checkContains;
	}

	private static boolean checkIfPassswordContainsUpper(String password) {
		char currentCharacter;
		boolean checkContains = false;
		for (int i = 0; i < password.length(); i++) {
			currentCharacter = password.charAt(i);
			if (Character.isUpperCase(currentCharacter))
				checkContains = true;
		}
		return checkContains;
	}

}
