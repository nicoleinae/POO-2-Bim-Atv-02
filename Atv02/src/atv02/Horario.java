package atv02;

public class Horario extends Tempo{

	private Integer hora;
	private Integer minuto;
	private Integer segundo;
	
	public Horario() {
	}
	
	public Horario( Integer hora, Integer minuto, Integer segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Integer getMinuto() {
		return minuto;
	}
	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}
	public Integer getSegundo() {
		return segundo;
	}
	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}
	@Override
	public long quantidade () {
		return (hora * 3600 + minuto * 60 + segundo);
	}
	@Override
	public String toString() {
		return (hora + ":" + minuto + ":" + segundo);
	}
	
}
