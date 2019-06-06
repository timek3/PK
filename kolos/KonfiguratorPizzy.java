import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class KonfiguratorPizzy {
	private List<String> rodzaj_ciasta;
	private List<String> sosy;
	private List<String> dodatki_warzywne;
	private List<String> dodatki_miesne;
	private Scanner input;
	
	
	
	public KonfiguratorPizzy() {
		this.rodzaj_ciasta = new ArrayList<String>();
		this.sosy = new ArrayList<String>();
		this.dodatki_warzywne = new ArrayList<String>();
		this.dodatki_miesne = new ArrayList<String>();
		input = new Scanner(System.in);
		init();
	}
	private void init() {
		rodzaj_ciasta.add("Pszenne");
		rodzaj_ciasta.add("Kukurydziane");
		sosy.add("Pomidorowy");
		sosy.add("Œmietanowy");
		dodatki_warzywne.add("Pieczarki");
		dodatki_warzywne.add("Kapary");
		dodatki_warzywne.add("Karczochy");
		dodatki_warzywne.add("Papryka");
		dodatki_warzywne.add("Pomidor");
		dodatki_miesne.add("Salami");
		dodatki_miesne.add("Szynka Parmeñska");
		dodatki_miesne.add("Boczek");
		dodatki_miesne.add("Kurczak");
	}
	private void wyswietlWszystko() {
		System.out.println("Rodzaje ciast");
		for(String s: rodzaj_ciasta) {
			System.out.println("\t"+s);
		}
		System.out.println("Sosy");
		for(String s: sosy) {
			System.out.println("\t"+s);
		}
		System.out.println("Dodatki warzywne");
		for(String s: dodatki_warzywne) {
			System.out.println("\t"+s);
		}
		System.out.println("Dodatki miêsne");
		for(String s: dodatki_miesne) {
			System.out.println("\t"+s);
		}
		
	}
	public void skonfigurujPizze() {
		while(true) {
			System.out.println("Co chcesz? Wybierz opcje: ");
			System.out.println("\t(1) Wyœwietliæ sk³adniki");
			System.out.println("\t(2) dodaæ nowy sk³adnik");
			System.out.println("\t(3) usun¹æ sk³adnik");
			System.out.println("\t(4) skomponowaæ pizze");
			System.out.println("\t(5) zrezygnowaæ z pizzy");
			System.out.print("? ");
			byte o = input.nextByte(); input.nextLine();
			byte k;
			String nazwa;
			switch (o) {
				case 1:
					wyswietlWszystko();
					break;
				case 2:
					System.out.println("Do jakiej kategorii chcesz dodaæ sk³adnik?");
					System.out.println("\t(1) Rodzaje ciast");
					System.out.println("\t(2) Sosy");
					System.out.println("\t(3) Dodatki warzywne");
					System.out.println("\t(4) Dodatki miêsne");
					k = input.nextByte(); input.nextLine();
					System.out.print("Podaj nazwe produktu");
					nazwa = input.nextLine();
					if(nazwa!=null) {
						switch(k) {
							case 1:
								rodzaj_ciasta.add(nazwa);
								for(String s: rodzaj_ciasta) {
									System.out.println("\t"+s);
								}
								break;
							case 2:
								sosy.add(nazwa);
								for(String s: sosy) {
									System.out.println("\t"+s);
								}
								break;
							case 3:
								dodatki_warzywne.add(nazwa);
								for(String s: dodatki_warzywne) {
									System.out.println("\t"+s);
								}
								break;
							case 4:
								dodatki_miesne.add(nazwa);
								for(String s: dodatki_miesne) {
									System.out.println("\t"+s);
								}
								break;
							default:
								System.err.println("Nie rozpoznajê kategorii!");
						}
					}
					break;
				case 3:

					System.out.println("Z jakiej kategorii chcesz usun¹æ sk³adnik?");
					System.out.println("\t(1) Rodzaje ciast");
					System.out.println("\t(2) Sosy");
					System.out.println("\t(3) Dodatki warzywne");
					System.out.println("\t(4) Dodatki miêsne");
					k = input.nextByte(); input.nextLine();

					switch(k) {
						case 1:
							for(String s: rodzaj_ciasta) {
								System.out.println("\t"+s);
							}
							System.out.print("Podaj nazwe produktu");
							nazwa = input.nextLine();
							if(nazwa!=null) {
								rodzaj_ciasta.remove(nazwa);
							}
							break;
						case 2:
							for(String s: sosy) {
								System.out.println("\t"+s);
							}
							System.out.print("Podaj nazwe produktu");
							nazwa = input.nextLine();
							if(nazwa!=null) {
								sosy.remove(nazwa);
							}
							break;
						case 3:
							for(String s: dodatki_warzywne) {
								System.out.println("\t"+s);
							}
							System.out.print("Podaj nazwe produktu");
							nazwa = input.nextLine();
							if(nazwa!=null) {
								dodatki_warzywne.remove(nazwa);
							}
							break;
						case 4:
							for(String s: dodatki_miesne) {
								System.out.println("\t"+s);
							}
							System.out.print("Podaj nazwe produktu");
							nazwa = input.nextLine();
							if(nazwa!=null) {
								dodatki_miesne.remove(nazwa);
							}
							break;
						default:
							System.err.println("Nie rozpoznajê kategorii!");
					}
					break;
				case 4:
					int i1;
					int i2;
					int i3;
					int i4;
					System.out.println("Jakie ciasto wybierasz?");
					for(String s: rodzaj_ciasta) {
						System.out.println("\t"+s);
					}
					i1= input.nextInt()-1;input.nextLine();
					System.out.println("Jaki sos wybierasz?");
					for(String s: sosy) {
						System.out.println("\t"+s);
					}
					i2= input.nextInt()-1;input.nextLine();
					System.out.println("Jakie dodatki warzywne wybierasz?");
					for(String s: dodatki_warzywne) {
						System.out.println("\t"+s);
					}
					i3= input.nextInt()-1;input.nextLine();
					System.out.println("Jakie dodatki miêsne wybierasz?");
					for(String s: dodatki_miesne) {
						System.out.println("\t"+s);
					}
					i4= input.nextInt()-1;input.nextLine();
					
					System.out.println("Twoja pizza ma ciasto: "+rodzaj_ciasta.get(i1)+", sos do pizzy: "+sosy.get(i2)+", oraz: "+dodatki_warzywne.get(i3)+", "+dodatki_miesne.get(i4)+".");
					break;
				case 5:
					return;
				default:
					System.err.println("Nie rozpoznajê opcji!");
			}
		}
	}
	
	public static void main(String[] args) {
		KonfiguratorPizzy k = new KonfiguratorPizzy();
		k.skonfigurujPizze();
		System.out.println("Koniec");
		
	}
	
}
