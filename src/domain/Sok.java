package domain;

import java.io.Serializable;

public class Sok implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String marka;
	private String nazwa;
	private String gatunek;
	private String opis;

	public Sok() {

	}

	public Sok(int id, String marka, String nazwa, String gatunek, String opis) {

		this.id = id;
		this.marka = marka;
		this.nazwa = nazwa;
		this.gatunek = gatunek;
		this.opis = opis;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String Gatunek) {
		this.gatunek = Gatunek;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
