import java.util.Random;

public class EmployeeWage{

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Wage_HR = 20;
        int Day_HRs = 8;
        Random random = new Random();
        int r = random.nextInt(2);
        if(r == 1){
            System.out.println("Employee Present");
            System.out.println("DayWage = " + Wage_HR * Day_HRs);
        }
        else
            System.out.println("Employee Absent");

    }
}