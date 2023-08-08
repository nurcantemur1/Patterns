package Observer;

public class Main {

	public static void main(String[] args) {
		Veri  v = new Veri();
		PastaGrafik pg = new PastaGrafik(v);
		CubukGrafik cg = new CubukGrafik(v);
		v.Attach(pg);
		v.Attach(cg);
		
		v.yeniVeri();
		v.yeniVeri();
		
		v.Detach(cg);
		v.yeniVeri();
	}

}
