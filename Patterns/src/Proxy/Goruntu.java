package Proxy;

public class Goruntu extends Grafik {

	private byte veri[];
	public Goruntu(String p) {
		path =p;
		veri = null;
	}

	@Override
	public void Ciz() {
		if(veri == null) {
			System.out.println("dosya yükleniyor "+path);
			veri = new byte[1000000];
			System.out.println("dosya ciziliyor ("+path+")");

		}
		else {
			System.out.println("dosya ciziliyor ("+path+")");

		}
	}

	@Override
	public void grafikBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
