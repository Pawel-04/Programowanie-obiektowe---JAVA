import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class main
{
	public static void main(String[] arg)
	{
		Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
		Trojkat rownoboczny = new Trojkat(7, 4, "biały");
		Kwadrat kw1 = new Kwadrat(10, "niebieski");
		Punkt punkt = new Punkt(5,4);

		maly_punkt.zwieksz(3,4);
		System.out.println(maly_punkt.opis());
		System.out.println(kw1.pole(12));
		System.out.println(rownoboczny.opis());
		System.out.println(punkt.x);

		Figura figura = new Figura("niebieska") {
			@Override
			String opis() {
				return "Obiekt klasy Figura";
			}

			@Override
			void skaluj(float skala) {

			}
		};

		Figura[] tablicaFigur = new Figura[10];

		tablicaFigur[0] = new Kwadrat(5, "niebieski");
		tablicaFigur[1] = new Prostokat(4, 6, "zielony");
		tablicaFigur[2] = new Trojkat(3, 4, "czerwony");
		tablicaFigur[3] = tablicaFigur[0];
		tablicaFigur[4] = new Kwadrat(8, "czarny");

		for (int i = 5; i < tablicaFigur.length; i++){
			tablicaFigur[i] = new Figura("pomarańczowy") {
				@Override
				String opis() {
					return "Obiekt klasy figura";
				}

				@Override
				void skaluj(float skala) {

				}
			};
		}
		for (int i = 0; i < tablicaFigur.length; i++){
			System.out.println("[" + i + "] " + tablicaFigur[i].opis());
		}

		List<IFigury> listaFigur = new ArrayList<>();

		Punkt tpunkt = new Punkt(1, 1);

		listaFigur.add(new Prostokat(3, 4, "zielony"));
		listaFigur.add(new Kwadrat(5, "niebieski"));
		listaFigur.add(new Trojkat(6, 2, "żółty"));

		System.out.println("------------------------");
		for (IFigury figury : listaFigur) {
			System.out.println("Powierzchnia: " + figury.getPowierzchnia());
			System.out.println("Czy w polu punktu (1,1): " + figury.wPolu(tpunkt));
		}
		System.out.println("------------------------");
		Okrag okrag = new Okrag(8);
		System.out.println(okrag.opis());
		okrag.skaluj(2);
		okrag.przesun(2,1);
		System.out.println(okrag.punkt.x);
		System.out.println(okrag.punkt.y);
	}
}