package maksym.man.service;

import java.util.HashMap;
import java.util.Map;

import maksym.man.model.Man;

public class ManService {
	private Map<String, Man> people;

    public ManService() {
        people = new HashMap<>();
    }

    public void saveMan(Man man) {
        people.put(man.getName(), man);
    }

    public void deleteMan(String name) {
        people.remove(name);
    }

    public void updateMan(Man man) {
        if (people.containsKey(man.getName())) {
            people.put(man.getName(), man);
        } else {
            System.out.println("Person with name " + man.getName() + " not found.");
        }
    }

    public void printAllPeople() {
        for (String name : people.keySet()) {
            Man person = people.get(name);
            System.out.println("Name: " + name);
            person.toStringReligion();
            System.out.println();
        }
    }
}
