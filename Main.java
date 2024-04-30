public class Main {
    private String make;
    private String model;
    private String color;
    private int year;

    // Constructor
    public Main(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        // Check if values entered match stored values
        if (autoMake.equals(make) && autoModel.equals(model) && autoColor.equals(color) && autoYear == year) {
           
            make = null;
            model = null;
            color = null;
            year = 0;
            return "The car has been removed";
        } else {
            return "There is nothing there";
        }
    }

    
    public static void main(String[] args) {
        
        Main myCar = new Main("Toyota", "Camry", "Blue", 1999);
        String result = myCar.removeVehicle("Toyota", "Camry", "Blue", 1999);
        System.out.println(result);
    }
}