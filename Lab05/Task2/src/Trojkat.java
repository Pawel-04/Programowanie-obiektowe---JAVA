
class Trojkat extends Figura {
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public void pole() {
		double pole = (wys * podst)/2;
		System.out.println("Pole trójkąta wynosi: "+pole);
	}

	public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	@Override
	String opis() {
		return "To jest trójkąt o wysokości: " +wys + " i podstawie: " +podst;
	}
}