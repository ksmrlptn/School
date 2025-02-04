package OverAllJavaProgram;

import java.util.Scanner;

public class GameCharacterAttackSpeed {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double BaseAS;
		int BonusAS;
		int lvl;
		double attackspeed;
		
		System.out.print("Enter the base attack Speed: ");
		BaseAS = input.nextDouble();
		System.out.print("Enter the bonus attack speed: ");
		BonusAS = input.nextInt();
		System.out.print("Enter the level: ");
		lvl = input.nextInt();
		
		System.out.println("Base attack speed: " + BaseAS);
		System.out.println("Bonus attack speed %: " + BonusAS);
		System.out.println("At level: " + lvl);
		
		attackspeed = BaseAS * (1 + (BonusAS / 100.00) * (lvl - 1));
		System.out.println("The character's current attack speed is " + Math.round(attackspeed * 1000) / 1000.0d);
		
	}
}