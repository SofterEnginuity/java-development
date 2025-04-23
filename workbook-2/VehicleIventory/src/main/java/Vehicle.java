
public class Vehicle {
        private long vehicleID;
        private String make;
        private String model;
        private int odometerReading;
        private float price;


    public Vehicle() {
        this.vehicleID = 0;
        this.make = "";
        this.model = "";
        this.odometerReading = 0;
        this.price = 0.0f;
    }

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
