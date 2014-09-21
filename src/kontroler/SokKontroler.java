package kontroler;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import domain.Sok;
 
@ApplicationScoped
public class SokKontroler{
	
	private List<Sok> soki;
	private int lastId = 1;
	
	public SokKontroler() {
		soki = new ArrayList<Sok>();
		generujDaneTestowe();
	}
		
	public void dodajNowy(String marka, String nazwa, String gatunek, String opis) {
		
		soki.add(new Sok(lastId++, marka, nazwa , gatunek, opis));
				
	}	 
	
	public void usunSok(Sok sok) {
		
		soki.remove(sok);
		
	} 

	public List<Sok> getSoki() {
		  
		return soki;
	}
	
	public Sok getSokById(int id){
		
		Sok sok = null;
		
		for(Sok p : soki){
			if(p.getId()==id){
				sok=p;
				break;
			}
		}
		
		return sok;
	}

	public void generujDaneTestowe(){
		soki.add(new Sok(lastId++, "Fortuna","Cytrusy i trawa","Owocowy", "Bardzo przyjemnie si� go pije, szczeg�lnie w upalne dni, ze �wie�ym ananasem i du�� ilo�ci� lodu. Dobra alternatywa dla tych, kt�rzy ju� nie mog� patrze� na wod�, nawet smakow�."));
		soki.add(new Sok(lastId++, "Hortex","Sok Pomara�czowy 100%","Naturalny", "Sok z najlepszych i najsmaczniejszych owoc�w. W sokach Hortex przekazane s� Tobie i Twoim najbli�szym najcenniejsze dary - zdrowie i pewno�� dobrego smaku."));
		soki.add(new Sok(lastId++, "Oskola","Sok z brzozy","Naturalny", "Sok brzozy nale�y pozyskiwa� wiosn�, zawiera wtedy du�o cukr�w i dlatego mo�na go stosowa� do produkcji napoju, a tak�e w kosmetyce do produkcji tzw. wody brzozowej. Staropolska nazwa soku brzozowego to Osko�a. Otrzymuje si� go przez g��bokie naci�cie pnia lub ga��zi brzozy wczesn� wiosn�." ));
		soki.add(new Sok(lastId++, "Cappy","Nap�j Multiwitamina","Nektar", "Odkryj tajemnice smaku Cappy! Multiwitamina... eksploduje owocowo, przeplataj�c s�odk� soczysto�� pomara�czy i winogron aksamitnym mu�ni�ciem brzoskwini, i zaskakuj�c� rze�ko�ci� jab�ka z akcentem dojrza�ej cytryny... Rozsmakuj si�." ));
		soki.add(new Sok(lastId++, "Tymbark","Sok 100% pomidor","Warzywny", "O smak naszego soku pomidorowego troszczymy si� od chwili posiania nasion. Starannie wybrani dostawcy uprawiaj� tylko najlepsze odmiany pomidor�w: Polfast, Polbig, Batory, Awizo i Etna. Od majowego sadzenia do pa�dziernikowych zbior�w dogl�damy krzew�w. Delikatnie przecieramy pomidory, kt�rych soczysto��, smak, aromatyczny, kwaskowo-s�odki mi��sz i intensywnie czerwona sk�rka nie maj� sobie r�wnych. Aby uzyska� lekko ostry smak dodajemy pikantnej papryki chilli i aromatycznego pieprzu." ));
		
	}


} 	


