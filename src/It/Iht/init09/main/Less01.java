package It.Iht.init09.main;

import java.util.Scanner;

public class Less01 {

	public static void main(String[] args) {
		double x;
		double sum;
		
		x = inputDoubleFromConsole("Введите первое значение: ");
		
		sum = result(x);
		print(x, sum);

	}

	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextDouble();
		return value;
	}

	public static double result(double x) {
		double sum;
		sum = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		return sum;
	}

	public static void print(double x, double sum) {
		System.out.println("при значении x = " + x + "значение функций sum = " + sum);
	
	}
}

	

	