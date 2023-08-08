package Proxy;

public class GoruntuVekili extends Grafik{

	private Goruntu v;
	public GoruntuVekili(String p) {
		path = p;
		v = new Goruntu(p);
	}
	
	@Override
	public void Ciz() {
		v.Ciz();
	}

	@Override
	public void grafikBilgisi() {
		System.out.println("dosya yolu"+path);
	}

}
