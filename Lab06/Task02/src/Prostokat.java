class Prostokat extends Figura implements IFigury {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}

	public void zwieksz(int x, int y) {
		this.wys += x;
		this.szer += y;
	}

	public String opis(){
		return "Obiekt klasy Prostokąt. Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	void skaluj(float skala) {
		szer *= skala;
		wys *= skala;
	}

	@Override
	public float getPowierzchnia() {
		return wys * szer;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return p.x >= 0 && p.x <= szer && p.y >= 0 && p.y <= wys;
	}
}