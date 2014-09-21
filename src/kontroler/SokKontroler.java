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
		soki.add(new Sok(lastId++, "Fortuna","Cytrusy i trawa","Owocowy", "Bardzo przyjemnie siê go pije, szczególnie w upalne dni, ze œwie¿ym ananasem i du¿¹ iloœci¹ lodu. Dobra alternatywa dla tych, którzy ju¿ nie mogê patrzeæ na wodê, nawet smakow¹."));
		soki.add(new Sok(lastId++, "Hortex","Sok Pomarañczowy 100%","Naturalny", "Sok z najlepszych i najsmaczniejszych owoców. W sokach Hortex przekazane s¹ Tobie i Twoim najbli¿szym najcenniejsze dary - zdrowie i pewnoœæ dobrego smaku."));
		soki.add(new Sok(lastId++, "Oskola","Sok z brzozy","Naturalny", "Sok brzozy nale¿y pozyskiwaæ wiosn¹, zawiera wtedy du¿o cukrów i dlatego mo¿na go stosowaæ do produkcji napoju, a tak¿e w kosmetyce do produkcji tzw. wody brzozowej. Staropolska nazwa soku brzozowego to Osko³a. Otrzymuje siê go przez g³êbokie naciêcie pnia lub ga³êzi brzozy wczesn¹ wiosn¹." ));
		soki.add(new Sok(lastId++, "Cappy","Napój Multiwitamina","Nektar", "Odkryj tajemnice smaku Cappy! Multiwitamina... eksploduje owocowo, przeplataj¹c s³odk¹ soczystoœæ pomarañczy i winogron aksamitnym muœniêciem brzoskwini, i zaskakuj¹c¹ rzeœkoœci¹ jab³ka z akcentem dojrza³ej cytryny... Rozsmakuj siê." ));
		soki.add(new Sok(lastId++, "Tymbark","Sok 100% pomidor","Warzywny", "O smak naszego soku pomidorowego troszczymy siê od chwili posiania nasion. Starannie wybrani dostawcy uprawiaj¹ tylko najlepsze odmiany pomidorów: Polfast, Polbig, Batory, Awizo i Etna. Od majowego sadzenia do paŸdziernikowych zbiorów dogl¹damy krzewów. Delikatnie przecieramy pomidory, których soczystoœæ, smak, aromatyczny, kwaskowo-s³odki mi¹¿sz i intensywnie czerwona skórka nie maj¹ sobie równych. Aby uzyskaæ lekko ostry smak dodajemy pikantnej papryki chilli i aromatycznego pieprzu." ));
		
	}


} 	


