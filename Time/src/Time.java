
public class Time {
	
	private int hora;
	private int minuto;
	private int segundo;

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	
	public String exibirHoraUniversal() {
		String message;
		this.getHora();
		this.getMinuto();
		this.getSegundo();
		message =  this.getHora()+":"+this.getMinuto()+":"+this.getSegundo();
		return message;
	}
	
	public String exibirHoraPadrao() {
		String message;
		String timeFormat;
		this.getHora();
		this.getMinuto();
		this.getSegundo();
		
		if (this.getHora() > 11) 
		{
			timeFormat = "PM";
		}
		else {
			timeFormat = "AM";
		}
		
		message =  (this.getHora() > 12 ? this.getHora() - 12 : this.getHora())+":"+this.getMinuto()+":"+this.getSegundo()+" "+timeFormat;
		return message;
	}
}
