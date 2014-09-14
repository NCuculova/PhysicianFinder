package mk.ukim.finki.ki.pf.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "symptoms")
public class Symptom extends BaseEntity{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
