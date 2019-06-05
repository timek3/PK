
public class Auto {
	private String marka;
	private String model;
	private int rocznik;
	private double przebieg;
	private double cena;
	
	public Auto(String marka, String model, int rocznik, double przebieg, double cena) {
		this.marka = marka;
		this.model = model;
		this.rocznik = rocznik;
		this.przebieg = przebieg;
		this.cena = cena;
	}
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public int getRocznik() {
		return rocznik;
	}
	public double getPrzebieg() {
		return przebieg;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	@Override
	public String toString() {
		return "Auto [marka=" + marka + ", model=" + model + ", rocznik=" + rocznik + ", przebieg=" + przebieg
				+ ", cena=" + cena + "]";
	}
}
