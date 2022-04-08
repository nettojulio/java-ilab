package ui;

import java.lang.reflect.Field;
import core.Produto;

public class Analisador {
	public static void main(String[] args) {
		/*
		 * StringBuffer StringBuilder
		 */

		Object obj;
		Produto p = new Produto();
		p.setId(1234);
		p.setDescricao("Mouse");
		p.setPreco(50.00);
		p.setLinkFoto("mouse.jpg");

		Produto p2 = new Produto();
		p2.setId(3216);
		p2.setDescricao("Computador");
		p2.setPreco(1000.00);
		p2.setLinkFoto("computador.png");

		obj = p;

		System.out.println("a referencia O aponta para um objeto do tipo:" + obj.getClass().getSimpleName());
		System.out.println("Antes do reflection...");
		System.out.println(p);

		try {
			Field[] atributos = obj.getClass().getDeclaredFields();
			for (Field f : atributos) {
				f.setAccessible(true);
				System.out.println("Atributo:" + f.getName() + " - Valor:" + f.get(obj));
			}

			Field f = obj.getClass().getDeclaredField("descricao");

			System.out.println("Vou pegar o que esta armazenado neste atributo no objeto OBJ");
			f.setAccessible(true);
			System.out.println(f.get(obj));
			f.set(obj, "Mouse cheio de luzinha que vira um circo");
			f.setAccessible(false);

			System.out.println(p);

		} catch (Exception ex) {
			System.err.println("Algo errado " + ex);
			ex.printStackTrace();
		}
	}

}
