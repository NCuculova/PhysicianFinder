package mk.ukim.finki.ki.pf.repository;

import java.util.List;

import mk.ukim.finki.ki.pf.model.Diagnose;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DiagnoseRepository extends JpaRepository<Diagnose, Long> {

	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1")
	public List<Diagnose> searchDiagnose1(Long id);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  OR s.id = ?2")
	public List<Diagnose> searchDiagnose2(Long id1, Long id2);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  OR s.id = ?2 OR s.id = ?3")
	public List<Diagnose> searchDiagnose3(Long id1, Long id2, Long id3);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  OR s.id = ?2 OR s.id = ?3 OR s.id = ?4")
	public List<Diagnose> searchDiagnose4(Long id1, Long id2, Long id3, Long id4);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  OR s.id = ?2 OR s.id = ?3 OR s.id = ?4 OR s.id = ?5")
	public List<Diagnose> searchDiagnose5(Long id1, Long id2, Long id3, Long id4, Long id5);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  AND s.id = ?2")
	public List<Diagnose> searchSpecificDiagnose2(Long id1, Long id2);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  AND s.id = ?2 AND s.id = ?3")
	public List<Diagnose> searchSpecificDiagnose3(Long id1, Long id2, Long id3);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  AND s.id = ?2 AND s.id = ?3 AND s.id = ?4")
	public List<Diagnose> searchSpecificDiagnose4(Long id1, Long id2, Long id3, Long id4);
	
	@Query(nativeQuery = true, value = "SELECT distinct(d.id), d.name FROM diagnoses as d"
			+ " JOIN diagnose_symptoms as ds ON d.id = ds.diagnose_id"
			+ " JOIN symptoms as s ON ds.symptom_id = s.id"
			+ " WHERE s.id = ?1  AND s.id = ?2 AND s.id = ?3 AND s.id = ?4 AND s.id = ?5")
	public List<Diagnose> searchSpecificDiagnose5(Long id1, Long id2, Long id3, Long id4, Long id5);
	

}
