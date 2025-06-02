class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Obiekt klasy Trojkat. Trojkat o wymairach: "+wys+"  "+podst;
	}

	@Override
	void skaluj(float skala) {
		podst *= skala;
		wys *= skala;
	}

	@Override
	public float getPowierzchnia() {
        return (float) (podst * wys) / 2;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}