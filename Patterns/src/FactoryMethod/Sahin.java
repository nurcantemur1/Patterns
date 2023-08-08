package FactoryMethod;

public class Sahin extends Car{

	public Sahin() {
		maxHz=180;
		anlikHz=0;
	}
	@Override
	public int maxhzAl() {
		return maxHz;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "Sahin";
	}

	@Override
	public void hizolcumu(int s) {
		anlikHz=s;
	}

}
