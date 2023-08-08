package Command;

public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		LambaAcKapat LIO = new LambaAcKapat(new Lamba());
		Televizyon tv = new Televizyon();
		OncekiKanal ok = new OncekiKanal(tv);
		SonrakiKanal sk = new SonrakiKanal(tv);
		
		m.komutEkle(LIO);
		m.komutEkle(ok);
		m.komutEkle(sk);
		
		m.menu();
	}

}
