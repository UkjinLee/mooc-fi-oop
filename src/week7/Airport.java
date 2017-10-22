package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Airport {

    private HashMap<String, Airplane> planes;
    private ArrayList<Flight> flights;
    private Scanner reader;

    public Airport(Scanner reader) {
        this.reader = reader;
        planes = new HashMap<>();
        flights = new ArrayList<>();
    }

    public void startSystem() {
        airportPanel();
        flightService();
    }

    private void airportPanel() {
        System.out.println("week7.Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            String input = airportPanelMenu();
            if (input.equals("x"))
                break;
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        planes.put(planeID, new Airplane(planeID, capacity));
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        flights.add(new Flight(planes.get(planeID), departure, destination));
    }

    private String airportPanelMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        return reader.nextLine();
    }

    private void flightService() {
        System.out.println("week7.Flight service");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            String input = flightServiceMenu();
            if (input.equals("x"))
                break;
            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();
            }
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.println(planes.get(planeID));
    }

    private void printFlights() {
        for (Flight flight : flights)
            System.out.println(flight);
    }

    private void printPlanes() {
        for (Airplane plane : planes.values())
            System.out.println(plane);
    }

    private String flightServiceMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
        return reader.nextLine();
    }

    public static void main(String[] args) {

//        http://mooc.cs.helsinki.fi/programming-part2/material/week-7?noredirect=1#e8

//        클래스 구조도 그리기 with 종이, 펜
//                1) 필요한 클래스 종류
//                2) 각 클래스별 멤버변수, 메소드 설정

        Airport airport = new Airport(new Scanner(System.in));
        airport.startSystem();
    }
}
