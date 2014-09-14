package mk.ukim.finki.ki.pf.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "specialty_diagnoses")
public class SpecialtyDiagnose extends BaseEntity{

	@ManyToOne
	private Specialty specialty;
	
	@ManyToOne
	private Diagnose diagnose;

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public Diagnose getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(Diagnose diagnose) {
		this.diagnose = diagnose;
	}
	
}
