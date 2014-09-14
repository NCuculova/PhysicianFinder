package mk.ukim.finki.ki.pf.service;

import java.util.List;

import mk.ukim.finki.ki.pf.model.SearchResults;
import mk.ukim.finki.ki.pf.model.Symptom;


public interface PhysicianFinderService {

	public void generateData();
	
	public SearchResults search(Long... symptoms);
	
	public List<Symptom> getSymptoms();

	public SearchResults specificSearch(Long... keywords);

	SearchResults searchAll(Long[] symptoms);
}
