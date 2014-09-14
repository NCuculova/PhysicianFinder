package mk.ukim.finki.ki.pf.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "physician_specialties")
public class PhysicianSpecialty extends BaseEntity{
	
	@ManyToOne
	private Physician physician;
	
	@ManyToOne
	private Specialty specialty;

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

}
