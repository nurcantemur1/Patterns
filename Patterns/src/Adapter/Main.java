package Adapter;

public class Main {

	public static void main(String[] args) {

		Player p = new Player();
		p.Add(new Muzik("şebnem ferah - fırtına"));
		p.Add(new Muzik("şebnem ferah - fırtına"));
		p.Add(new Muzik("şebnem ferah - fırtına"));
		p.Add(new Muzik("şebnem ferah - fırtına"));
		p.Add(new Muzik("şebnem ferah - fırtına"));
		
		p.Add(new OGGAdaptor("Metallica - one"));
		p.Play();
	}

}
