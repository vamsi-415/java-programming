import java.util.*;

public class Experiment7 {
	public static void main(String[] args) {
		final int num = 10000;
		Random gen = new Random();
		int die1, die2;
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		int count = 0;
		while (count < num) {
			die1 = gen.nextInt(6) + 1;
			die2 = gen.nextInt(6) + 1;
			if (die1 == die2) {
				if (die1 == 1)
					one++;
				else if (die1 == 2)
					two++;
				else if (die1 == 3)
					three++;
				else if (die1 == 4)
					four++;
				else if (die1 == 5)
					five++;
				else if (die1 == 6)
					six++;
			}
			count++;
		}
		System.out.println("You rolled double ones " + one + " out of " + count + " rolls.");
		System.out.println("You rolled double twos " + two + " out of " + count + " rolls.");
		System.out.println("You rolled double threes " + three + " out of " + count + " rolls.");
		System.out.println("You rolled double fours " + four + " out of " + count + " rolls.");
		System.out.println("You rolled double fives " + five + " out of " + count + " rolls.");
		System.out.println("You rolled double sixes " + six + " out of " + count + " rolls.");
	}
}
