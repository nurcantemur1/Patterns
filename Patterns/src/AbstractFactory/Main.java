package AbstractFactory;

public class Main {
	public static SoyutOyun oyunYarat(GameFactory f) {

		SoyutOyun game = f.yenioyun();
		SoyutOda oda1 = f.odaYarat();
		SoyutKapi kapi1 = f.kapiYarat();
		SoyutOda oda2 = f.odaYarat();
		SoyutKapi kapi2 = f.kapiYarat();
		game.odaEkle(oda1);
		game.odaEkle(oda2);
		oda1.kapiEkle(kapi2);
		oda2.kapiEkle(kapi1);
		return game;
		
	}
	public static void main(String[] args) {
		SoyutOyun normalOyun = oyunYarat(new NormalGameFactory());
		normalOyun.calistir();
		SoyutOyun buyuluOyun = oyunYarat(new MagicGameFactory());
		buyuluOyun.calistir();
	}

}
