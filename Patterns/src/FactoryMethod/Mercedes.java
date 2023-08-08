package FactoryMethod;

public class Mercedes extends Car {

	public Mercedes() {
		maxHz=360;
		anlikHz=0;
	}
	@Override
	public int maxhzAl() {
		// TODO Auto-generated method stub
		return maxHz;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "mercedes";
	}

	@Override
	public void hizolcumu(int s) {
		anlikHz=s;
	}

}
