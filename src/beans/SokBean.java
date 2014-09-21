package beans;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import kontroler.SokKontroler;
import domain.Sok;

@ManagedBean(name="sokBean")
@SessionScoped

public class SokBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Sok sok = new Sok();
	private ListDataModel<Sok> soki = new ListDataModel<Sok>();

	@Inject
	private SokKontroler sokKontroler;
	
	public ListDataModel<Sok> getAllSoki() {
		soki.setWrappedData(sokKontroler.getSoki());
		return soki;
	}


	public Sok getSok() {
		return sok;
	}


	public void setSok(Sok sok) {
		this.sok = sok;
	}
	
	public String addSok() {
		sokKontroler.dodajNowy(sok.getMarka(), sok.getNazwa(), sok.getGatunek(), sok.getOpis());
		return "mojeSoki";
	}	
	
	public String usunSok() {
		Sok p = soki.getRowData();
		sokKontroler.usunSok(p);
		return null;
	}
	
	
	
}
