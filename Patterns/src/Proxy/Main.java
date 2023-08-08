package Proxy;

public class Main {
	public static void bilgiler(Grafik g) {
		g.grafikBilgisi();

	}
	public static void ekranaCiz(Grafik g) {
		g.Ciz();

	}

	public static void main(String[] args) {
		GoruntuVekili a = new GoruntuVekili("aa.jpg");
		bilgiler(a);
		ekranaCiz(a);
		

	}

}
