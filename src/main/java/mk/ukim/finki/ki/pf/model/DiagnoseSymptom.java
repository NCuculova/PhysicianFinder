package mk.ukim.finki.ki.pf.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "diagnose_symptoms")
public class DiagnoseSymptom extends BaseEntity{
	
	@ManyToOne
	private Diagnose diagnose;
	
	@ManyToOne
	private Symptom symptom;

	public Diagnose getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(Diagnose diagnose) {
		this.diagnose = diagnose;
	}

	public Symptom getSymptom() {
		return symptom;
	}

	public void setSymptom(Symptom symptom) {
		this.symptom = symptom;
	}

}
