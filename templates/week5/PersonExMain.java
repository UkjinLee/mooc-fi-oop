public class PersonExMain {

    public static void main(String[] args) {

//        EXERCISE 93.1: CALCULATING THE AGE BASED ON THE BIRTHDAY

//        Thomas age 62 years
//        Pekka age 24 years

        PersonEx pekka = new PersonEx("Pekka", 15, 2, 1993);
        PersonEx steve = new PersonEx("Thomas", 1, 3, 1955);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");


//        EXERCISE 93.2: COMPARING AGES BASED ON BIRTHDATE

//        Martin is older than Pekka: false
//        Pekka is older than Martin: true

//        week5.PersonEx pekka = new week5.PersonEx("Pekka", 15, 2, 1983);
//        week5.PersonEx martin = new week5.PersonEx("Martin", 1, 10, 1983);
//
//        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
//        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );


        //    EXERCISE 93.3: NEW CONSTRUCTORS

//        Pekka, born 15.2.1983
//        Steve, born 13.9.2017

//        week5.PersonEx pekka = new week5.PersonEx("Pekka", new week5.MyDate(15, 2, 1983));
//        week5.PersonEx steve = new week5.PersonEx("Steve");
//
//        System.out.println( pekka );
//        System.out.println( steve );
    }
}
