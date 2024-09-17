package Fortune;

import java.util.Scanner;

public class FortuneTeller {
	String[] fortunes = {
			"Don’t just think, act!",
			"A golden egg of opportunity falls into your lap this month.",
			"Happiness begins with facing life with a smile and a wink.",
			"Physical activity will dramatically improve your outlook today.",
			"Say hello to others. You will have a happier day.",
			"Self-knowledge is a life long process.",
			"What’s that in your eye? Oh…it’s a sparkle.",
			"Your talents will be recognized and suitably rewarded.",
			"You will be successful in your work.",
			"Welcome change.",
			"Miles are covered one step at a time.",
			"You will soon be surrounded by good friends and laughter.",
			"If you continually give, you will continually have.",
			"Go take a rest; you deserve it.",
			"Any day above ground is a good day.",
			"A gambler not only will lose what he has, but also will lose what he doesn’t have."
			};
	Scanner sc = new Scanner(System.in);
	public int getName() {
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		return name.length();
	}
	public int getColor() {
		System.out.println("Enter your favourite colour :");
		String color = sc.nextLine();
		return color.length();
	}
	public void tellFortune(int name, int color) {
		int fortune = name + color;
		System.out.println(fortunes[fortune%16]);
	}
	public static void main(String[] args) {
		FortuneTeller ft = new FortuneTeller();
		ft.tellFortune(ft.getName(),ft.getColor());
	}
}
