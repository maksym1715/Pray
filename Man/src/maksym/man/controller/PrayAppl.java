package maksym.man.controller;

import maksym.man.model.Jew;
import maksym.man.model.Man;
import maksym.man.model.Muslim;
import maksym.man.model.Peasant;
import maksym.man.service.ManService;

public class PrayAppl {

	public static void main(String[] args) {
				
		 ManService manService = new ManService();
		
		
		 Man person = new Man("Max");
		 manService.saveMan(person);

	        Jew jew = new Jew("Mardehay");
	        manService.saveMan(jew);

	        Muslim muslim = new Muslim("Ahmed");
	        manService.saveMan(muslim);
        
        

        Peasant christian = new Peasant("John");
       manService.saveMan(christian);

       manService.printAllPeople();

       manService.deleteMan("Mardehay");
       
        
       Man updatedMan = new Man("Max");
       updatedMan.learn(); 
       manService.updateMan(updatedMan);

       System.out.println("\nAfter updating:\n");
       manService.printAllPeople();
        
		
	}

}
