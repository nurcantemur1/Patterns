package Observer;

import java.util.ArrayList;

public class PastaGrafik implements Observer{

	private Veri kaynak;
	private ArrayList<Integer> veriList;
	
	public PastaGrafik(Veri k) {
		kaynak =k;
		veriList = new ArrayList<Integer>();
		for(int i : kaynak.veriAl()) {
			veriList.add(i);
		}
	}

	@Override
	public void Update() {
		veriList.clear();
		for(int i : kaynak.veriAl()) {
			veriList.add(i);
		}
		System.out.println("pasta grafi�i g�ncellendi");
		System.out.println(veriList);
	}

}
