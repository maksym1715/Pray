package maksym.man.model;

import maksym.man.controller.Pray;

public class Man implements Pray {
	
	public void pray() {
		System.out.println("Prayer of a common person");
	}; 
	
	public void learn() {
		System.out.println("learn torah");
	}

	@Override
	public void toStringReligion() {
		pray();
		learn();
		
	}; 

}
