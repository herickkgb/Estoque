package UltraEmojiComba;

import java.util.Random;

public class Luta {
// atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

// Metodos publicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			aprovada = true;
			desafiado = l1;
			desafiante = l2;
		} else {
			aprovada = false;
			desafiado = l1;
			desafiante = l2;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiado.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println(" ### RESULTADO D LUTA###");
			switch (vencedor) {
			case 0: // empate
				System.out.println("Empatado");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vitoria do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 3:
				System.out.println("Vitoria do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		} else {
			System.out.println("Aluta não pdoe acontaecer!!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	// Metodos especiais

}
