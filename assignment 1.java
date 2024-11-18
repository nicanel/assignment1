public class car{
    private string cardId;
    private string model;
    private string make;
    private boolean isrented;

    public car(string carId, string model,string make){
        this.carId =carId;
        this.model =model;
        this.make =make;
        this.isrented =true;
    }

    public string getcarId(){
        return cardId;
    }

    public string getmodel(){
        return model;

    }

    public string getmake(){
        return make;

    }
    
    public boolean isrented(){
        return isrented;

    }
    public void setRented(boolean rented){
        isrented =rented;

    }

    public string tostring(){
       return "Car{" +
                "carId='" + carId + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", isrented=" + isrented +
                '}';
    public class Customer{
        private string customerId;
        private string name;
        private string contact;

        public Customer(string customerId, string name, string contact){
            this.customerId= customerId;
            this.name= name;
            this.contact= contact;
        }

        public string getcustomerId(){
            return customerId;
        }
        public string getname(){
            return name;
        }
        public string getcontact(){
            return contact;
        }
        public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }   
     import java.time.Date;

public class RentalTransaction {
    private String transactionId;
    private String carId;
    private String customerId;
    private Date rentalDate;
    private Date returnDate;

    public RentalTransaction(String transactionId, String carId, String customerId, Date rentalDate, Date returnDate) {
        this.transactionId = transactionId;
        this.carId = carId;
        this.customerId = customerId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCarId() {
        return carId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    
    public String toString() {
        return "RentalTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", carId='" + carId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
import java.util.*;

public class TestRentalAgency{
    public void testAddCar(){
        RentalAgency agency= new RentalAgency();
        Car car= new car("KAW298", "Nissan sunny");
        agency.addcar(car);
        assertEquals(1,agency.getAvailableCars().size());

    }

    public void testRentCar(){
        RentalAgency agency= new RentalAgency();
        Car car= new car("KAW298", "Nissan sunny");
        agency.addcar(car);
        Customer customer= new customer("nic obita", "3421115");
        agency.addCustomer(customer);
        Car rentedcar= agency.rentcar("KAW298", Customer);
        assertNotNull(rentedcar);
        assertTrue(rentedcar.isrented());
        }
        
    public void testGetAvailablecars(){
        RentalAgency agency= new RentalAgency();
        Car car1= new Car("KAW298", "Nissan sunny");
        Car car2= new Car("KAJ119", "Isuzu");
        agency.addcar(car1);
        agency.addcar(car2);
        Customer customer= new Customer("nic obita", "3421115");
        agency.addCustomer(Customer);
        agency.rentcar("KAW298", customer);
        List<Car>availableCars= agency.getAvailableCars();
        assertEquals(1,availableCars.size());
        assertEquals("Isuzu", availableCars.get(0).getmodel());
    }    
    
}
