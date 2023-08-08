package AbstractFactory;

import java.util.Scanner;

public class BuyuluKapi extends SoyutKapi {
	private boolean acik;
	private String sihirli;

	public BuyuluKapi() {
		sihirli="a��l susam a��l";
		acik = false;
	}

	@Override
	public boolean kapiAc() {

		if(acik) {
			return true;
		}
		System.out.println("sihirli c�mleyi s�yleyin");
		
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		sc.close();
		if(k.equalsIgnoreCase(sihirli)) {
			acik = true;
			return acik;
		}
		else return false;
	}

	@Override
	public void kapiKapat() {

		acik = false;
	}

}
