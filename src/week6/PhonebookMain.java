package week6;

public class PhonebookMain {

    public static void main(String[] args) {

//        EXERCISE 94.1: PERSON

//        Pekka Mikkola
//        040-123123
//        Pekka Mikkola  number: 040-123123
//        Pekka Mikkola  number: 050-333444

//        week6.Person pekka = new week6.Person("Pekka Mikkola", "040-123123");
//
//        System.out.println(pekka.getName());
//        System.out.println(pekka.getNumber());
//
//        System.out.println(pekka);
//        pekka.changeNumber("050-333444");
//        System.out.println(pekka);


//        EXERCISE 94.2: ADDING PERSONS TO PHONEBOOK

//        Pekka Mikkola  number: 040-123123
//        Edsger Dijkstra  number: 045-456123
//        Donald Knuth  number: 050-222333

//        week6.Phonebook phonebook = new week6.Phonebook();
//
//        phonebook.add("Pekka Mikkola", "040-123123");
//        phonebook.add("Edsger Dijkstra", "045-456123");
//        phonebook.add("Donald Knuth", "050-222333");
//
//        phonebook.printAll();


//        EXERCISE 94.3: SEARCHING FOR NUMBERS FROM THE PHONEBOOKS

//        040-123123
//        number not known

        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );
    }
}
