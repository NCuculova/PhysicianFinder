package mk.ukim.finki.ki.pf.web;

import mk.ukim.finki.ki.pf.model.SearchResults;
import mk.ukim.finki.ki.pf.service.PhysicianFinderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@Autowired
	PhysicianFinderService service;

	/**
	 * Method that loads index.jsp on page load and refresh
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView result = new ModelAndView("index");
		return result;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(@RequestParam("keywords") Long... keywords) {
		System.out.println("KEYWORDS: " + keywords);
		SearchResults results = service.search(keywords);
		ModelAndView result = new ModelAndView("index");
		return result;
	}

	@RequestMapping(value = "/generate", method = RequestMethod.GET)
	public ModelAndView generate() {
		service.generateData();
		ModelAndView result = new ModelAndView("index");
		return result;
	}

}
