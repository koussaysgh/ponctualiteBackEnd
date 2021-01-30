package tn.esprit.spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController  
@CrossOrigin(origins="http://localhost:4200")  
public class PonctuationController {
@Autowired
private ServiceCalculNomberDePonctuation  service;
	
@RequestMapping(value="/",method=RequestMethod.POST)
public int CalculNomberDePonctuation(@RequestBody Message ch){
	
	try {
		
		System.out.println(ch.getCh());
		return service.calculNomberDePonctuation(ch.getCh());
	} catch (Exception e) {
		
		return -1;
	}
	
}
	
}
