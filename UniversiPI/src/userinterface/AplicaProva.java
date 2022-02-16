package userinterface;

import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class AplicaProva {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		QuestaoSimples questoes[] = new QuestaoSimples[5];
		String resposta;
		int score = 0;

		questoes[0] = new QuestaoComDica("AAA", "1", "Dica: Menor que 2 e Maior que 0");
		questoes[1] = new QuestaoMultiplaEscolha("BBB", "1", "1", "2", "3", "4");
		questoes[2] = new QuestaoSimples("ccc", "3");
		questoes[3] = new QuestaoSimples("ddd", "4");
		questoes[4] = new QuestaoSimples("eee", "5");

		for (QuestaoSimples aplicarQuestao : questoes) {
			System.out.println(aplicarQuestao.aplicarQuestao());
			System.out.print("Resposta: ");
			resposta = keyboard.nextLine();

			if (aplicarQuestao.corrigir(resposta)) {
				System.out.println("Resposta Correta!\n");
				score++;
			} else {
				System.out.println("Resposta Incorreta!\n");
			}
		}

		System.out.printf("\nAvaliação Encerrada!\n\nScore de %d/%d respostas\n%.2f%% de aproveitamento!", score, questoes.length,
				(double) (score * 100 / questoes.length));
		keyboard.close();
	}

}
