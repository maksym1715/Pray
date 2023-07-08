package maksym.man.controller;

import maksym.man.model.Jew;
import maksym.man.model.Man;
import maksym.man.model.Muslim;
import maksym.man.model.Peasant;

public class PrayAppl {

	public static void main(String[] args) {
		Man person = new Man();
        person.toStringReligion();;  

        Jew jew = new Jew();
        jew.toStringReligion();;
      

        Muslim muslim = new Muslim();
        muslim.toStringReligion();; 
        

        Peasant christian = new Peasant();
        christian.toStringReligion();;  
        
		
	}

}
