
public class UltraEmojiCombat {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscrip", "Brasil", 29, 1.8f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA",35,1.65f,80.9f,13,0,2);
		l[3] = new Lutador("Ufocolbol", "Jap�o",28,1.93f,81.6f,5,4,3);
		l[4] = new Lutador("DeadCode","Australia",28,1.70f,119.3f,13,0,2);
		l[5] = new Lutador("Nefdaart","EUA",30,1.81f,105.7f,12,2,4);
		
		
		l[0].status();
		l[1].status();
		l[2].status();
		l[3].status();
		l[4].status();
		l[5].status();

		
		l[3].perderLuta();
		l[1].ganharLuta();
		l[2].perderLuta();
	}

}
