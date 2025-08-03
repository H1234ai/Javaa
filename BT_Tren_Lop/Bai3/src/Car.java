public class Car {
    private String brand;
    private int maxSpeed ;
    public Car (){
    }
    public Car (String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand () {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = maxSpeed;
    }

    public void run (){
        System.out.println("Xe " +brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km/h");
    }
}