package employeewage;

public class UC3_PartTimeEmployeeAndWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 7;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage System");
        int employeeCheck = (int) (Math.random() * 10) % 2; //Using RANDOM function to get any random number for Employee presence.
        int employeeCheck = (int) (Math.random() * 10) % 3; //Using RANDOM function to get any random number for Employee presence.
        int dailyWage = 0;
        if (employeeCheck == 1) {
            System.out.println("Employee is present.");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR; //Calculating daily wage
            System.out.println("Employee is in full time.");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        } else if (employeeCheck == 2) {
            System.out.println("Employee is in part time.");
            dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
        } else {
            System.out.println("Employee is absent.");
        }
        System.out.println("Daily wage of the employee is:  " +dailyWage);
        System.out.println("Daily wage of the employee is:  " + dailyWage);
    }
}
