class Kwadrat extends Prostokat implements IFigury{
	Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
	}

	public double pole (int bok){
		return bok * bok;
	}
}