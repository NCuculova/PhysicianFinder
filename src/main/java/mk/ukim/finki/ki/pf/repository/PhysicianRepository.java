package mk.ukim.finki.ki.pf.repository;

import java.util.List;

import mk.ukim.finki.ki.pf.model.Physician;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhysicianRepository extends JpaRepository<Physician, Long> {

	@Query(nativeQuery = true, value = "SELECT distinct(p.id), p.date, p.firstName, p.lastName, p.gender, p.location FROM physicians as p"
			+ " JOIN physician_specialties as ps ON p.id = ps.physician_id"
			+ " JOIN specialities as s ON ps.specialty_id = s.id"
			+ " JOIN specialty_diagnoses as sd ON sd.specialty_id = s.id"
			+ " JOIN diagnoses as d ON d.id = sd.diagnose_id"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as ss ON ds.symptom_id = ss.id"
			+ " WHERE ss.id = ?1")
	public List<Physician> search1(Long id);
	
	@Query(nativeQuery = true, value = "SELECT distinct(p.id), p.date, p.firstName, p.lastName, p.gender, p.location FROM physicians as p"
			+ " JOIN physician_specialties as ps ON p.id = ps.physician_id"
			+ " JOIN specialities as s ON ps.specialty_id = s.id"
			+ " JOIN specialty_diagnoses as sd ON sd.specialty_id = s.id"
			+ " JOIN diagnoses as d ON d.id = sd.diagnose_id"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as ss ON ds.symptom_id = ss.id"
			+ " WHERE ss.id = ?1 OR ss.id = ?2")
	public List<Physician> search2(Long id1, Long id2);
	
	@Query(nativeQuery = true, value = "SELECT distinct(p.id), p.date, p.firstName, p.lastName, p.gender, p.location FROM physicians as p"
			+ " JOIN physician_specialties as ps ON p.id = ps.physician_id"
			+ " JOIN specialities as s ON ps.specialty_id = s.id"
			+ " JOIN specialty_diagnoses as sd ON sd.specialty_id = s.id"
			+ " JOIN diagnoses as d ON d.id = sd.diagnose_id"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as ss ON ds.symptom_id = ss.id"
			+ " WHERE ss.id = ?1 OR ss.id = ?2 OR ss.id = ?3")
	public List<Physician> search3(Long id1, Long id2, Long id3);
	
	@Query(nativeQuery = true, value = "SELECT distinct(p.id), p.date, p.firstName, p.lastName, p.gender, p.location FROM physicians as p"
			+ " JOIN physician_specialties as ps ON p.id = ps.physician_id"
			+ " JOIN specialities as s ON ps.specialty_id = s.id"
			+ " JOIN specialty_diagnoses as sd ON sd.specialty_id = s.id"
			+ " JOIN diagnoses as d ON d.id = sd.diagnose_id"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as ss ON ds.symptom_id = ss.id"
			+ " WHERE ss.id = ?1 OR ss.id = ?2 OR ss.id = ?3 OR ss.id = ?4")
	public List<Physician> search4(Long id1, Long id2, Long id3, Long id4);
	
	@Query(nativeQuery = true, value = "SELECT distinct(p.id), p.date, p.firstName, p.lastName, p.gender, p.location FROM physicians as p"
			+ " JOIN physician_specialties as ps ON p.id = ps.physician_id"
			+ " JOIN specialities as s ON ps.specialty_id = s.id"
			+ " JOIN specialty_diagnoses as sd ON sd.specialty_id = s.id"
			+ " JOIN diagnoses as d ON d.id = sd.diagnose_id"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as ss ON ds.symptom_id = ss.id"
			+ " WHERE ss.id = ?1 OR ss.id = ?2 OR ss.id = ?3 OR ss.id = ?4 OR ss.id = ?5")
	public List<Physician> search5(Long id1, Long id2, Long id3, Long id4, Long id5);
}
