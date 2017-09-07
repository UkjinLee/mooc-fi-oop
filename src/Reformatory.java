public class Reformatory {

    private int totalWeightsMeasured;

    public Reformatory() {
        totalWeightsMeasured = 0;
    }

//  EXERCISE 85.1: WEIGHT OF A PERSON

    // return the weight of the person
    public int weight(Person person) {
        totalWeightsMeasured++;
        return person.getWeight();
    }


//  EXERCISE 85.2: FEEDING A PERSON

//    increases the weight of its parameter by one
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }


//    EXERCISE 85.3: NUMBER OF TIMES A WEIGHT HAS BEEN MEASURED

//    returns the total number of times a weight has been measured
    public int totalWeightsMeasured() {
        return totalWeightsMeasured;
    }
}
