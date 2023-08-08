package FactoryMethod;

public class SahinFactory extends CarFactory {

	@Override
	public Car arabauret() {
		// TODO Auto-generated method stub
		return new Sahin();
	}

}
