package Composite;

public class Resim implements Icerik {

	private String path;
	public Resim(String r){
		path=r;
	}
	
	@Override
	public void Operation() {
		System.out.print("<img src='"+path+"'/>");
		
	}

	@Override
	public void Add(Icerik i) {
		return;		
	}

	@Override
	public void Remove(Icerik i) {
		return;
		
	}

	@Override
	public Icerik GetChild(int i) {
		return null;
	}

}
