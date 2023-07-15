package maksym.man.controller;

import java.util.HashMap;
import java.util.Map;

import maksym.man.model.Jew;
import maksym.man.model.Man;
import maksym.man.model.Muslim;
import maksym.man.model.Peasant;

public class PrayAppl {

	public static void main(String[] args) {
				
		Map<String, Man> people = new HashMap<>();
		
		
		Man person = new Man("Max");
		 people.put(person.getName(), person);
       

        Jew jew = new Jew("Mardehay");
        people.put(jew.getName(), jew);
        

        Muslim muslim = new Muslim("Ahmed");
        people.put(muslim.getName(), muslim);
        
        

        Peasant christian = new Peasant("John");
        people.put(christian.getName(), christian);
       
        
        for (String name : people.keySet()) {
            Man person1 = people.get(name);
            System.out.println("Name: " + name);
            person1.toStringReligion();
            System.out.println();
        }
        
		
	}

}
