package corejava.questions.day1;

/*Write a program to accept a number from the user; then display the reverse of the entered number.
(Example: Entered number = 12345; Reversed number = 54321)
*/
import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Reveresed number is :" + revNum(num));

		if (num == revNum(num)) {
			System.out.println("it is palindrome"); // Checking for Palindrome if Orginal==Reverse
		}

	}

	private static int revNum(int n) {
		int rev = 0;
		while (n > 0) { // number is 5678
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		return rev; // reversed number is 8765

	}

}
