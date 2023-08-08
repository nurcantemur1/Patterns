package Adapter;

public class OGG {

	private String songName;
	public OGG(String s) {
		songName=s;
}
	public void OGGPlayer(int hz) {
		System.out.println(songName+" "+hz+" hýzýnda çalýyor");
	}

}
