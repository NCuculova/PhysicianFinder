package mk.ukim.finki.ki.pf.web.rest;

import java.util.List;

import mk.ukim.finki.ki.pf.model.SearchResults;
import mk.ukim.finki.ki.pf.model.Symptom;
import mk.ukim.finki.ki.pf.service.PhysicianFinderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data/rest")
public class PhysicianResource {

	@Autowired
	PhysicianFinderService service;

	@RequestMapping(value = "/search/{keywords}", method = RequestMethod.GET, produces = "application/json")
	public SearchResults search(@PathVariable Long... keywords) {
		return service.searchAll(keywords);
	}

	@RequestMapping(value = "/specificSearch/{keywords}", method = RequestMethod.GET, produces = "application/json")
	public SearchResults specificSearch(@PathVariable Long... keywords) {
		return service.specificSearch(keywords);
	}

	@RequestMapping(value = "/symptom", method = RequestMethod.GET, produces = "application/json")
	public List<Symptom> get() {
		return service.getSymptoms();
	}

}