package jubiler;
import java.util.ArrayList;
import java.util.List;
public class Jubiler {
	private String nazwa;
	private List<Pierscionek> pierscionki;
	private Pierscionek okazja;
	private int ile_pierscionkow;
	public Jubiler(String nazwa) {
		this.nazwa = nazwa;
		this.pierscionki = new ArrayList<Pierscionek>();
		this.okazja = null;
		this.ile_pierscionkow=0;
	}
	public Pierscionek getOkazja() {
		return okazja;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void wyznaczOkazje() {
		double max=pierscionki.get(0).getStopienKorzysci();
		int i_max=0;
		for(int i=1;i<=pierscionki.size();i++) {
			if(max<pierscionki.get(i).getStopienKorzysci()) {
				max=pierscionki.get(i).getStopienKorzysci();
				i_max=i;
			}
		}
		this.okazja=pierscionki.get(i_max);
	}
	public void dodajPierscionek(Pierscionek p) {
		if(p.getCena()<0) {
			System.err.println("Cena nie mo¿e byæ ujemna");
			return;
		}
		pierscionki.add(p);
	}
	public boolean usunPierscionek(Pierscionek doUsuniecia) {
		for(Pierscionek p : pierscionki) {
			if(doUsuniecia.toString()==p.toString()) {
				pierscionki.remove(doUsuniecia);
				wyznaczOkazje();
				return true;
			}
		}
		System.err.println(doUsuniecia.toString() + "nie jest dostepny u jubilera "+ this.getNazwa());
		return false;
	}
	public void pokazOferte(List<Pierscionek> lista) {
		int i =1;
		for(Pierscionek p : lista ) {
			System.out.println("\t"+i+" "+ p.toString());
		}
		System.out.println("***OFERTA SPECJALNA***" + this.getOkazja().toString());
	}
	
}
