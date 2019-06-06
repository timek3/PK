package jubiler;

public class Pierscionek {
	private String typ;
	private double proba;
	private double masa;
	private double cena;
	
	public Pierscionek(String typ, double proba, double masa, double cena) {
		this.typ = typ;
		this.proba = proba;
		this.masa = masa;
		this.cena = cena;
	}
	public String getTyp() {
		return typ;
	}
	public double getProba() {
		return proba;
	}
	public double getMasa() {
		return masa;
	}
	public double getCena() {
		return cena;
	}
	public double getStopienKorzysci() {
		return ((this.getProba()*this.getMasa())/this.getCena());
	}
	@Override
	public String toString() {
		return "Pierscionek [typ=" + typ + ", proba=" + proba + ", masa=" + masa + ", cena=" + cena + "]";
	}
	
}
