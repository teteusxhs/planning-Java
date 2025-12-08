
package com.planning.service;


import com.planning.model.Person;
import com.planning.model.ObesePerson;
import com.planning.model.OverWeightPerson;
import com.planning.model.UnderWeightPerson;
import com.planning.model.NormalWeightPerson;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private final List<Person> persons = new ArrayList<>();

    public List<Person> findAll() {
        return persons;
    }

    public Person createPersonWithClassification(String name, int age, double weight, double height, int physicalFrequency) {

        double bmi = Person.calculateBmiStatic(weight, height);

        Person newUser;

        if (bmi >= 30.0) {
            newUser = new ObesePerson(name, age, weight, height, physicalFrequency);
        } else if (bmi >= 25.0) {
            newUser = new OverWeightPerson(name, age, weight, height, physicalFrequency);
        } else if (bmi < 18.5) {
            newUser = new UnderWeightPerson(name, age, weight, height, physicalFrequency);
        } else {
            newUser = new NormalWeightPerson(name, age, weight, height, physicalFrequency);
        }

        persons.add(newUser);
        return newUser;
    }

    public boolean removeUser(int index) {
        if (index >= 0 && index < persons.size()) {
            persons.remove(index);
            return true;
        }
        return false;
    }
}
