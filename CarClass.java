class Car {

  private String make;
  private String model;
  private int year;


  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public void printDetails() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}

public class CarClass {

  public static void main(String[] args) {
  
    Car car1 = new Car("Toyota", "Camry", 2023);
    Car car2 = new Car("Honda", "Civic", 2020);


    car1.printDetails();
    System.out.println();
    car2.printDetails();
  }
}
