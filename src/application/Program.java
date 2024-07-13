package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Program {

	public static void main(String[] args) {
		// DESAFIO: Combate - DevSuperior

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Player 1
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		sc.nextLine(); // consumir a linha

		Champion champion1 = new Champion(name, life, attack, armor);

		// Player 2
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		System.out.println();

		Champion champion2 = new Champion(name, life, attack, armor);

		// Turnos
		System.out.print("Quantos turnos você deseja executar? ");
		int turno = sc.nextInt();

		// Resultados
		// while(champion1.getLife() < 0 || champion2.getLife() < 0) {
		for (int i = 1; i <= turno; i++) {
			System.out.println();
			System.out.println("Resultado do turno " + i + ":");

			champion1.takeDamage(champion2);
			if (champion2.getLife() < 0) {
				champion2.setLife(0);
				//System.out.print("morreu");
				i = i + 5;
			}
			champion2.takeDamage(champion1);
			if (champion1.getLife() < 0) {
				champion1.setLife(0);
				i = i + 5;
			}
			System.out.println(champion1.status());
			System.out.println(champion2.status());
		}
		// }

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
