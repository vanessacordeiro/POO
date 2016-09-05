package modelo;

public class Flight {
	private String modelo;
	private int anoFabric;
	private int velocidadeAtual;
	private int altitudeAtual;
	private String direcao;
	private String transportadora;
	private String horaPartida;
	private String horaChegada;
	private Codigos origem;
	private Codigos destino;
	private FlightStatus status;
	
	
	public Flight(){	}
	
	public Flight (String modelo, int anoFabric, int velocidadeAtual, int altitudeAtual, String direcao, String transportadora, String horaPartida, String horaChegada, Codigos origem, Codigos destino, FlightStatus status)
	{
		this.modelo = modelo;
		this.anoFabric = anoFabric;
		this.velocidadeAtual = velocidadeAtual;
		this.altitudeAtual = altitudeAtual;
		this.direcao = direcao;
		this.transportadora = transportadora;
		this.horaPartida = horaPartida;
		this.horaChegada = horaChegada;
		this.origem = origem;
		this.destino = destino;
		this.status = status;
	}
	
	public int[] changeAltitude(int altitude)
	{
		int atual[] = new int [2]; 
		atual[0] = altitudeAtual;
		altitudeAtual = altitudeAtual + altitude;
		atual[1] = altitudeAtual;
		status = FlightStatus.subindo;
		return atual;
	}
	
	public int[] reduceSpeed(int velocidade)
	{
		int atual[] = new int [2]; 
		atual[0] = velocidadeAtual;
		velocidadeAtual = velocidadeAtual - velocidade;
		atual[1] = velocidadeAtual;
		return atual;
	}
	
	public FlightStatus[] beginLandingApproach()
	{
		FlightStatus atual[] = new FlightStatus[2];
		atual[0] = status;
		status = FlightStatus.pousando;
		atual[1] = status;
		return atual;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabric() {
		return anoFabric;
	}

	public void setAnoFabric(int anoFabric) {
		this.anoFabric = anoFabric;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getAltitudeAtual() {
		return altitudeAtual;
	}

	public void setAltitudeAtual(int altitudeAtual) {
		this.altitudeAtual = altitudeAtual;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}

	public Codigos getOrigem() {
		return origem;
	}

	public void setOrigem(Codigos origem) {
		this.origem = origem;
	}

	public Codigos getDestino() {
		return destino;
	}

	public void setDestino(Codigos destino) {
		this.destino = destino;
	}

	public FlightStatus getStatus() {
		return status;
	}

	public void setStatus(FlightStatus status) {
		this.status = status;
	}
}
