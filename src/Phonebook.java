import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> people;

    public Phonebook() {
        this.people = new ArrayList<>();
    }

    public void add(String name, String number) {
        people.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : people) {
            if (name.equals(person.getName()))
                return person.getNumber();
        }
        return "number not known";
    }
}
