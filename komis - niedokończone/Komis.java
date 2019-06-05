
public class Komis {
	private String nazwaKomisu;
	private Auto[] auta;
	private Auto okazja;
	private int ile_aut;
	public Komis(String nazwaKomisu) {
		this.nazwaKomisu = nazwaKomisu;
		this.auta = new Auto[10];
		this.ile_aut = 0;
		this.okazja = null;
	}
	public String getNazwaKomisu() {
		return nazwaKomisu;
	}
	public Auto[] getAuta() {
		return auta;
	}
	public Auto getOkazja() {
		return okazja;
	}
	
	public void wyznaczOkazje() {
		double min = ((auta[0].getCena()*auta[0].getPrzebieg())/(auta[0].getRocznik()-1899)); 
		int minIndex = 0;
		for(int i=1; i<=auta.length;i++) {
			if(((auta[i].getCena()*auta[i].getPrzebieg())/(auta[i].getRocznik()-1899))<min) {
				min=((auta[i].getCena()*auta[i].getPrzebieg())/(auta[i].getRocznik()-1899));
				minIndex=i;
			}
		}
		this.okazja=auta[minIndex];
	}
	
	public void dodajAuto(Auto auto) {
		auta[ile_aut++]=auto;
	}
	
}
