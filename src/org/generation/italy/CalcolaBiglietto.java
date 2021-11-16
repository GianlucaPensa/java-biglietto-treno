package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci i km da percorrere : ");
		double KmDaPercorrere = scanner.nextDouble();
		
		System.out.println("Inserisci la tua et� : ");
		int et� = scanner.nextInt();
		
		scanner.close();
		
		double BasePrice = KmDaPercorrere * 0.21;
		
		
		if(et� >= 18 && et�<=65) {
			System.out.println("L'importo da pagare � di : ");
			System.out.println(BasePrice);
		}
		else if(et�<18) {
			double sconto = BasePrice - (BasePrice * 20 / 100);
			System.out.println("L'importo da pagare � di : ");
			System.out.println(sconto);
		}
		else {
			double sconto = BasePrice - (BasePrice * 40 / 100);
			System.out.println("L'importo da pagare � di : ");
			System.out.println(sconto);
		}
	}
}
