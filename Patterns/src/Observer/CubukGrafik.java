package Observer;

import java.util.ArrayList;

public class CubukGrafik implements Observer{

	private Veri kaynak;
	private ArrayList<Integer> veriList;
	
	public CubukGrafik(Veri k) {
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
		System.out.println("cubuk grafiði güncellendi");
		System.out.println(veriList);
	}

}