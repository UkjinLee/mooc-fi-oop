import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

//    EXERCISE 9.2: THE OWNER, BASED OF THE REGISTRATION PLATE

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<>();
    }

    //    adds the parameter owner of the car which corresponds to the parameter registration plate.
//    The method returns true if the car had no owner;
//    if the car had an owner already, the method returns false and it doesn't do anything
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) != null)
            return false;
        owners.put(plate, owner);
        return true;
    }

//    returns the car owner which corresponds to the parameter register number.
//    If the car was not registered, it returns null
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

//    delete the information connected to the parameter registration plate.
//    The method returns true if the information was deleted,
//    and false if there was no information connected to the parameter in the register.
    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate))
            return false;
        owners.remove(plate);
        return true;
    }


//    EXERCISE 9.3: MORE FOR THE VEHICLE REGISTER

//    prints out all the registration plates stored
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet())
            System.out.println(plate);
    }

//    prints all the car owners stored.
//    Each owner's name has to be printed only once, even though they had more than one car
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner : owners.values()) {
            if (!ownerList.contains(owner)) {
                ownerList.add(owner);
                System.out.println(owner);
            }
        }
    }

    public static void main(String[] args) {

        //    EXERCISE 9.2: THE OWNER, BASED OF THE REGISTRATION PLATE

//        FI ABC-123 is not registered
//        FI ABC-123 is already registered
//        FI ABC-123 belongs to John
//        KO ORG-777 belongs to null
//        FI ABC-123 is deleted
//        FI ABC-123 is not registered

//        VehicleRegister register = new VehicleRegister();
//
//        RegistrationPlate plate = new RegistrationPlate("FI", "ABC-123");
//        if (register.add(plate, "John"))
//            System.out.println(plate + " is not registered");
//        if (!register.add(plate, "Paul")) {
//            System.out.println(plate + " is already registered");
//        }
//
//        System.out.println(plate + " belongs to " + register.get(plate));
//        RegistrationPlate newPlate = new RegistrationPlate("KO", "ORG-777");
//        System.out.println(newPlate + " belongs to " + register.get(newPlate));
//
//        if (register.delete(plate))
//            System.out.println(plate + " is deleted");
//        if (!register.delete(plate))
//            System.out.println(plate + " is not registered");


        //    EXERCISE 9.3: MORE FOR THE VEHICLE REGISTER

//        FI ABC-123
//        KO ORG-777
//        CA SCT-456
//        US TEX-839
//        John
//        Kevin
//        Nathan

        VehicleRegister register = new VehicleRegister();
        register.add(new RegistrationPlate("FI", "ABC-123"), "John");
        register.add(new RegistrationPlate("KO", "ORG-777"), "Kevin");
        register.add(new RegistrationPlate("CA", "SCT-456"), "Nathan");
        register.add(new RegistrationPlate("US", "TEX-839"), "Kevin");

        register.printRegistrationPlates();
        register.printOwners();
    }
}
