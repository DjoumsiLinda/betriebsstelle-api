package main.java.tech.getarrays.betriebsstelleapi.proxy.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Betriebsstelle {

	private String name;
	private String kurzname;
	private String typ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKurzname() {
		return kurzname;
	}
	public void setKurzname(String kurzname) {
		this.kurzname = kurzname;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
}
