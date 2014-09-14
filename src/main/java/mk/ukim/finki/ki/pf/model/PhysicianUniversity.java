package mk.ukim.finki.ki.pf.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "physician_universities")
public class PhysicianUniversity extends BaseEntity {

	@ManyToOne
	private Physician physician;

	@ManyToOne
	private University university;

	public Physician getPhysician() {
		return physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

}
