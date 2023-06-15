package BuilderDesignPattern;

public class Vehicle {

private String company;
private String modelName;
private int price;
private int engine;

 void getDetails(){

     System.out.println("Vehicle Details \n Company :" + this.company+ "\n Model : " +this.modelName+ "\nEngine : " + this.engine+ " CC\n Price : " + this.price) ;
}
public Vehicle(String company, String modelName, int price, int engine) {
    this.company = company;
    this.modelName = modelName;
    this.price = price;
    this.engine = engine;
}

// Inner Builder Class for vehicle building
public static class VehicleBuilder{
    private String company;
    private String modelName;
    private int price;
    private int engine;


    public VehicleBuilder setCompany(String companyName){
        this.company = companyName;
        return this;
    }

    public VehicleBuilder setModel(String model){
        this.modelName = model;
        return this;
    }

    public VehicleBuilder setPrice(int price){
        this.price = price;
        return this;
    }
    public VehicleBuilder setEngine(int engine){
        this.engine = engine;
        return this;
    }

    public Vehicle getVehicle(){

        return new Vehicle(company, modelName, price, engine);
    }


}

    
}
