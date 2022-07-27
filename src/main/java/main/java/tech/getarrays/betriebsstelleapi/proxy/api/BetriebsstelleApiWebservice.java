package main.java.tech.getarrays.betriebsstelleapi.proxy.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.tech.getarrays.betriebsstelleapi.proxy.beans.Betriebsstelle;

@RequestMapping("/betriebstelle")
public interface BetriebsstelleApiWebservice 
{
	@GetMapping(value={"/{bst}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Betriebsstelle> anckelmannsplatz(@PathVariable("bst") String bst);
}
