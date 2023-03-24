package firstAndReserveTeam_encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    //· name: String
    //
    //· firstTeam: List<Person>
    //
    //· reserveTeam: List<Person>
    //
    //The class should have constructors:
    //
    //· Team(String name)
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void addPlayer(Person person){
        if(person.getAge() < 40){
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
}
