package AbstractFactory;

public class MagicGameFactory extends GameFactory {

	@Override
	public SoyutOyun yenioyun() {
		// TODO Auto-generated method stub
		return new BuyuluOyun();
	}

	@Override
	public SoyutKapi kapiYarat() {
		// TODO Auto-generated method stub
		return new BuyuluKapi();
	}

	@Override
	public SoyutOda odaYarat() {
		// TODO Auto-generated method stub
		return new BuyuluOda();
	}


}
