import java.util.Scanner;

public class TimeTeste {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Time hora1;
		hora1 = new Time();
		hora1.setTime(0, 24, 59);
		
		System.out.println(hora1.exibirHoraUniversal());
		System.out.println(hora1.exibirHoraPadrao());
		
		keyboard.close();
	}
}
