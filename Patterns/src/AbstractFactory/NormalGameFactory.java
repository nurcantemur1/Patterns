package AbstractFactory;

public class NormalGameFactory extends GameFactory{

	@Override
	public SoyutOyun yenioyun() {
		// TODO Auto-generated method stub
		return new NormalOyun();
	}

	@Override
	public SoyutKapi kapiYarat() {
		// TODO Auto-generated method stub
		return new NormalKapi();
	}

	@Override
	public SoyutOda odaYarat() {
		// TODO Auto-generated method stub
		return new NormalOda();
	}


}
