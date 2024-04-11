public class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String regNo, String make, int yearOfManufacture, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.value = value; 
    }
    
    public String getRegNo() {
      return regNo;
    }
        
    public String getMake() {
      return make; 
    }
    
    public int getYearOfManufacture () {
      return yearOfManufacture;
    }        
    
    public double getValue() {
      return value;
    }
    
    public double setValue() {
      return value = value;
    }    
    public int calculateAge(int currentYear) {
        currentYear = 2024;
        int age = currentYear - yearOfManufacture;
        System.out.print("Current Car Age: " + age);
        return age;
    }

    @Override
    public String toString() {
        return "Reg No: " + regNo + ", Make: " + make + ", Year of Manufacture: " + yearOfManufacture + ", Value: Php" + value;
    }
 }   