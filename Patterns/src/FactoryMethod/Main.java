package FactoryMethod;

public class Main {
	public static void car(CarFactory f) {
		Car c = f.arabauret();
		System.out.println(c.brand()+" marka araba üretildi");
	}

	public static void main(String[] args) {
		car(new SahinFactory());
		car(new MercedesFactory());
	}

}
