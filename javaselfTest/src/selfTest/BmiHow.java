package selfTest;

import java.util.Scanner;

public class BmiHow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("体重："+"KG");
		Double t=sc.nextDouble();
		System.out.println("身高："+"m");
		Double s=sc.nextDouble();
		Double bmi=t/(s*s);
		System.out.println(bmi);
		if (bmi<18.5) {
			System.out.println("过轻：低于18.5");
		}else if ((bmi>=18.5)&&(bmi<25)) {
			System.out.println("正常：18.5-25");
		}else if ((bmi>=25)&&(bmi<28)) {
			System.out.println("过重：25-28");
		}else if ((bmi>=28)&&(bmi<32)) {
			System.out.println("肥胖：28-32");
		}else {
			System.out.println("非常肥胖：高于32");
		}
	}
}
