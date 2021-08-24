public class EmpWage {
    //constants
    public static final int IS_PRESENT_FULL_TIME=1;
    public static final int IS_PRESENT_HALF_TIME=2;

    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        //variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PRESENT_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PRESENT_HALF_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: "+ totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company: "+company+" is: "+totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {

        computeEmpWage("Dmart", 20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }
}