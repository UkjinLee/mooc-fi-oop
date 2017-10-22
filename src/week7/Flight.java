package week7;

public class Flight {

    private Airplane plane;
    private String departure;
    private String destination;

    public Flight(Airplane plane, String departure, String destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + departure + "-" + destination + ")";
    }
}
