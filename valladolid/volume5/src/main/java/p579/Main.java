package p579;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		while ( !(input = scanner.next()).trim().equals("0:00") ) {
			String[] tokens = input.split(":");
			int hour = Integer.parseInt(tokens[0]);
			int minute = Integer.parseInt(tokens[1]);
			System.out.printf("%.3f\n", calcular(hour, minute));
		}
		
		scanner.close();
	}

	private static double calcular(int hour, int minute) {
		double hourHand = hour * 30 + (0.5d * minute);
		double minuteHand = 6d * minute;
		double difference = hourHand - minuteHand;
		difference = Math.abs(difference);
		if (difference > 180) {
			difference = 360 - difference;
		}
		return difference;
	}

}
