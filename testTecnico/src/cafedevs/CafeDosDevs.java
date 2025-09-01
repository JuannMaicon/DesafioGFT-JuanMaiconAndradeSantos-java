package cafedevs;

import java.util.Scanner;

public class CafeDosDevs {
	public static void main(String[] args) {
		// instancia o scanner
		Scanner sc = new Scanner(System.in);

		// entrada de dados para saber quantos devs tem
		System.out.print("Informe o número de devs: ");
		int qtdDevs;
		qtdDevs = sc.nextInt();

		// vetor para armazenar
		int[] consumo = new int[qtdDevs];
		int totalSemana = 0;

		// saber quantas xicaras cada um toma por dia... precisa inserir um numero da
		// espaço para inserir o proximo
		System.out.print("Quantas xícaras por dia cada um toma: ");
		for (int i = 0; i < qtdDevs; i++) {
			consumo[i] = sc.nextInt();
			totalSemana += consumo[i] * 5;
		}

		// total de xicaras por semana
		System.out.println("Total da semana: " + totalSemana + " xícaras");

		// fazer a validação do estoque
		if (totalSemana <= 100) {
			System.out.println("Estoque suficiente");
		} else {
			System.out.println("Estoque insuficiente");
		}

	}
}
