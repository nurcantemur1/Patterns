package FactoryMethod;

public class MercedesFactory extends CarFactory{

	@Override
	public Car arabauret() {
		// TODO Auto-generated method stub
		return new Mercedes();
	}
	
}
