package Adapter;

public class OGGAdaptor extends Muzik {

	private OGG ogg;
	public OGGAdaptor(String i) {
		super(i);
		ogg = new OGG(i);
	}

	@Override
	public void Mp3player() {
		ogg.OGGPlayer(5);
	}

}
