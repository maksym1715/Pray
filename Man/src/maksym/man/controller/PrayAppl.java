package maksym.man.controller;

import maksym.man.model.Jew;
import maksym.man.model.Man;
import maksym.man.model.Muslim;
import maksym.man.model.Peasant;

public class PrayAppl {

	public static void main(String[] args) {
		Man person = new Man();
        person.pray();  

        Jew jew = new Jew();
        jew.pray(); 

        Muslim muslim = new Muslim();
        muslim.pray();  

        Peasant christian = new Peasant();
        christian.pray();  
		
	}

}
