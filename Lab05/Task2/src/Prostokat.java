
class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

    double getPowierzchnia() {
        return (szer * wys);
    }

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public void przesun(float x, float y) {
		if (punkt == null) {
			punkt = new Punkt(0, 0);
		}
		punkt.przesun(x, y);
	}

	@Override
	String opis() {
		return "To jest prostokąt o bokach: " +szer + " i " +wys;
	}
}