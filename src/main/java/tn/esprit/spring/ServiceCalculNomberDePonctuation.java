package tn.esprit.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ServiceCalculNomberDePonctuation {

	
	
	
	
	public int calculNomberDePonctuation(String ch){
		
		System.out.println(ch);
		int numberDePonctuation=0;
		
		List<Object> l=new ArrayList<>();
		l.add('.');
		l.add(',');
		l.add(';');
		l.add(':');
		l.add('!');
		l.add('?');
		
		
		
	for (int i=0;i<ch.length();i++) {
		if(l.contains(ch.charAt(i))){
			numberDePonctuation++;
		}
	}
		return numberDePonctuation;
	}

}
