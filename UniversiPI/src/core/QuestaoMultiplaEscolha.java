package core;

public class QuestaoMultiplaEscolha extends QuestaoSimples {
	protected String alternativa1;
	protected String alternativa2;
	protected String alternativa3;
	protected String alternativa4;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alternativa1, String alternativa2,
			String alternativa3, String alternativa4) {
		super(enunciado, resposta);
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
	}

	@Override
	public String aplicarQuestao() {
		return this.enunciado + "\n" + this.alternativa1 + "\n" + this.alternativa2 + "\n" + this.alternativa3 + "\n"
				+ this.alternativa4 + "\n";
	}

}
