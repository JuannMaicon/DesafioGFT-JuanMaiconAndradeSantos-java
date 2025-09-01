package emailFormatado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// criando um scanner
		Scanner sc = new Scanner(System.in);

		// instancia do GeradorEmail
		GeradorEmail gerador = new GeradorEmail();

		// instancia lista funcionarios
		List<Funcionario> funcionarios = new ArrayList<>();

		// loop para cadastrar funcionarios
		while (true) {
			System.out.print("Digite o nome completo (ou 'sair' para encerrar): ");
			String nome = sc.nextLine();

			// encerra loop
			if (nome.equalsIgnoreCase("sair"))
				break;
			
			// gera email a partir do nome
			String email = gerador.gerarEmail(nome);

			// instacia para gerar funcionario
			Funcionario f = new Funcionario(nome, email);
			
			// adiona funcionarios na lista
			funcionarios.add(f);
            
			//exibe p email gerado para funcionario
			System.out.println("Email gerado: " + f.getEmail());
		}
            //exibe lista de funcionarios 
		System.out.println("\nLista de funcionários cadastrados:");
		for (Funcionario f : funcionarios) {
			System.out.println(f.getNomeCompleto() + " -> " + f.getEmail());
		}

		
	}
}