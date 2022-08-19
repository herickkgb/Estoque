package UltraEmojiComba;

public class Lutador {
	// atribustos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derroas, empates;

	// metodos pubçlicos
	public void apresentar() {
		System.out.println("--------------------------------------");
		System.out.println("Chegou a Hora apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "Mtrs");
		System.out.println("Pesando " + this.getPeso() + "Kgs");
		System.out.println(this.getVitorias() + " Vitorias ");
		System.out.println(this.getDerroas() + " Derrotas ");
		System.out.println(this.getEmpates() + " Empates ");

	}

	public void status() {
		System.out.println("--------STATUS----------");
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println(" Vitorias: " + this.getVitorias());
		System.out.println(" Derrotas: " + this.getDerroas());
		System.out.println(" Empates: "  + this.getEmpates());
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerroas(this.getDerroas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	// get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerroas() {
		return derroas;
	}

	public void setDerroas(int derroas) {
		this.derroas = derroas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	// metodos especiais

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derroas = de;
		this.empates = em;
	}

}
