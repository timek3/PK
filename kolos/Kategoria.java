
public class Kategoria {
	private String nazwa;
	private Skladnik[] lista_skladnikow;
	private int ile;

	public Kategoria(String nazwa) {
		this.nazwa = nazwa;
		this.lista_skladnikow = new Skladnik[10];
		this.ile = 0;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public Skladnik skladnik(int nr) {
		if (nr < 0 || nr > ile) {
			System.err.println(nazwa + ": Nie ma takiego produktu na liscie");
			return null;
		}
		return lista_produktow[nr_produktu-1];
	}
	
	
}
