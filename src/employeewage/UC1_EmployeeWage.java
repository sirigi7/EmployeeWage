package employeewage;

public class UC1_EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage System");
        int employeeCheck = (int) (Math.random() * 10) % 2; //Using RANDOM function to get any random number for Employee presence.
        if (employeeCheck == 0) {
            System.out.println("Employee is absent.");
        } else {
            int dailyWage = 0;
            if (employeeCheck == 1) {
                System.out.println("Employee is present.");
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR; //Calculating daily wage
            } else {
                System.out.println("Employee is absent.");
            }
            System.out.println("Daily wage of the employee is:  " + dailyWage);
        }
        // public static void main(String[] args) {

        //   System.out.printf("Welcome to Employee Wage System");
        // System.out.println("Welcome to Employee Wage System");
        //   int employeeCheck = (int) (Math.random() * 10) % 2; //Using RANDOM function to get any random number for Employee presence.
        //   if (employeeCheck == 0) {
        System.out.println("Employee is absent.");
//        }
        //      else {
        //        System.out.println("Employee is present.");
        //  }
        //}
    }
}

