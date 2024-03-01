import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRate {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private  final int RHR = 70;
    private  final double LB = 0.5;
    private final double UB = 0.85;
    HeartRate(String firstName,String lastName, LocalDate dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getPersonAge(){
        AgeCalculator calculator = new AgeCalculator();
        return calculator.calculateAge(this.dob).getYears();
    }

    public int getPersonMaximumHeartRate(){
        int age = this.getPersonAge();
        return 220 - age;
    }

    public void printTargetHeartRateRange(){

        int AHR = this.getPersonMaximumHeartRate()-RHR;
        double LBTHR = (AHR*LB)+RHR;
        double UBTHR = (AHR*UB)+RHR;

        System.out.println("The Target Heart Rate Range is between "+LBTHR+" and "+UBTHR);

    }

    public String toString() {

        return "First Name : "+this.firstName+"\nLast Name : "+this.lastName+"\nAge : "+this.getPersonAge()+"\nDate of Birth : "+this.getDob().toString()+"\nMaximum Heart Rate : "+this.getPersonMaximumHeartRate();
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String firstName = input.nextLine();
        System.out.println("Please, enter your last name:");
        String lastName = input.nextLine();
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14");
        String bd = input.nextLine();
        LocalDate birthday = null;
        try {
            birthday = LocalDate.parse(bd, formatter);
        } catch(DateTimeParseException e) {
            System.out.println("Error! Please try again");
        }

        HeartRate heartRate = new HeartRate(firstName,lastName,birthday);
        heartRate.printTargetHeartRateRange();
        System.out.println(heartRate);
        input.close();

    }

}
