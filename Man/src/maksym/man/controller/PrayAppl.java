package maksym.man.controller;

import maksym.man.model.Jew;
import maksym.man.model.Man;
import maksym.man.model.Muslim;
import maksym.man.model.Peasant;

public class PrayAppl {

	public static void main(String[] args) {
		Man person = new Man();
        person.pray();  // Output: "Prayer of a common person"

        Jew jew = new Jew();
        jew.pray();  // Output: "Prayer of a Jew"

        Muslim muslim = new Muslim();
        muslim.pray();  // Output: "Prayer of a Muslim"

        Peasant christian = new Peasant();
        christian.pray();  // Output: "Prayer of a Christian"
		
	}

}
