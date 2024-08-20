package atv02;

public class Data extends Tempo{

	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	
	public Data(Integer dia, Integer mes, Integer ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public long quantidade() {
		return (ano * 31104000 + mes * 2592000 + dia * 86400);
	}
	@Override
	public String toString() {
		return  (dia + "/" + mes + "/" + ano);
	}

}
