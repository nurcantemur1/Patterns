package AbstractFactory;

import java.util.ArrayList;

public class BuyuluOyun extends SoyutOyun {
	
	ArrayList<SoyutOda> odalar;
	
	public BuyuluOyun() {
		odalar = new ArrayList<SoyutOda>();
	}

	@Override
	public void odaEkle(SoyutOda a) {
		odalar.add(a);
	}

	@Override
	public void calistir() {
		System.out.println("b�y�l� oyun �al���yor");
		System.out.println("oda say�s�" + odalar.size());
	}
}
