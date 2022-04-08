package br.com.xmlgenerator;

import br.com.xmlgenerator.fabrica.FabricaXML;
import br.com.xmlgenerator.fabrica.GerarXML;
import br.com.xmlgenerator.main.Cliente;
import br.com.xmlgenerator.main.Departamento;
import br.com.xmlgenerator.main.Localizacao;
import br.com.xmlgenerator.main.Produto;

public class Analisador {
	public static void main(String[] args) {

		Produto p = new Produto(123, "Computador i5 16Gb HD 1Tb", 2500, "computador.jpg", new Departamento(1, "Informatica", new Localizacao("centro", 1, 23, 10)));
		Cliente c = new Cliente(10012, "Usuário Teste", "teste@teste.com.br", "71-987654321", "01/01/1991");

		String xmlP = GerarXML.geradorXML(p, GerarXML.COM_CABECALHO);
		String xmlC = GerarXML.geradorXML(c, GerarXML.COM_CABECALHO);

		System.out.println(xmlP);
		System.out.println(xmlC);
		
		FabricaXML.gerarArquivoXML(p);
		FabricaXML.gerarArquivoXML(c);
	}
}