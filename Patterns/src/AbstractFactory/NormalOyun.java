package AbstractFactory;

import java.util.ArrayList;

public class NormalOyun extends SoyutOyun {
	
	ArrayList<SoyutOda> odalar;
	
	public NormalOyun() {
		odalar = new ArrayList<SoyutOda>();
	}

	@Override
	public void odaEkle(SoyutOda a) {
		odalar.add(a);
	}

	@Override
	public void calistir() {
		System.out.println("normal oyun çalýþýyor");
		System.out.println("oda sayýsý" + odalar.size());
	}
}
