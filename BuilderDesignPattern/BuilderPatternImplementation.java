package BuilderDesignPattern;

import BuilderDesignPattern.Vehicle.VehicleBuilder;

public class BuilderPatternImplementation {

    public static void main(String[] args) {
        VehicleBuilder vehicleBuildere = new Vehicle.VehicleBuilder();
        VehicleBuilder vehicleBuildere2 = new Vehicle.VehicleBuilder();

        vehicleBuildere.setCompany("Honda");
        vehicleBuildere.setModel("City");
        vehicleBuildere.setPrice(8000000);
        vehicleBuildere.setEngine(1600);

        vehicleBuildere2.setCompany("Toyota");
        vehicleBuildere2.setModel("GLI");
        vehicleBuildere2.setPrice(6000000);
        vehicleBuildere2.setEngine(1600);

        Vehicle vehicle = vehicleBuildere.getVehicle();
        Vehicle vehicle2 = vehicleBuildere2.getVehicle();
        vehicle.getDetails();
        System.out.println("Other Model \n");
        vehicle2.getDetails();


    }
    
}
