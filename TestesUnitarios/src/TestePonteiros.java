
public class TestePonteiros {
	public static void main(String args[]) {
		String s1, s2;
		s1 = new String("ola nave");
		s2 = new String("ola nave");
		System.out.println(s1);
		System.out.println(s2);

		if (s1 == s2) {
			System.out.println("Mesmo endereço");
		} else {
			System.out.println("Diferente endereço");
		}

		if (s1.equals(s2)) {
			System.out.println("Mesmo conteúdo");
		} else {
			System.out.println("Diferente conteúdo");
		}

		s1 = "E agora sem nave";

		System.out.println(s1);
		System.out.println(s2);

		if (s1 == s2) {
			System.out.println("Mesmo endereço");
		} else {
			System.out.println("Diferente endereço");
		}

		if (s1.equals(s2)) {
			System.out.println("Mesmo conteúdo");
		} else {
			System.out.println("Diferente conteúdo");
		}

	}
}
