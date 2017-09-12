import java.util.Calendar;

public class PersonEx {
    private String name;
    private MyDate birthday;

    public PersonEx(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }

    //    EXERCISE 93.1: CALCULATING THE AGE BASED ON THE BIRTHDAY

    //    use the method differenceInYears in the class MyDate
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int date = Calendar.getInstance().get(Calendar.DATE);
        int month =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate current = new MyDate(date, month, year);
        return current.differenceInYears(birthday);
    }


//    EXERCISE 93.2: COMPARING AGES BASED ON BIRTHDATE

    public boolean olderThan(PersonEx compared) {
        // compare the ages based on birthdate
        return age() > compared.age();
    }


//    EXERCISE 93.3: NEW CONSTRUCTORS

//    sets the given MyDate-object to be the birthday of the person
    public PersonEx(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

//    sets the current date to be the birthday of the person
    public PersonEx(String name) {
        this.name = name;
        int date = Calendar.getInstance().get(Calendar.DATE);
        int month =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate current = new MyDate(date, month, year);
        birthday = current;
    }
}
