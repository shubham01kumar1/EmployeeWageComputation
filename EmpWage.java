public class EmpWage {
    public static final int IS_PRESENT_FULL_TIME=1;
    public static final int IS_PRESENT_HALF_TIME=2;
    public static final int WAGE_PER_HOUR=20;
    public static final int MAX_WORK_DAYS=20;
    public static final int MAX_WORK_HOURS=100;

    public static int computeEmpWage(){
        int totalWorkHrs=0;
        int days=0;

        while(days<MAX_WORK_DAYS && totalWorkHrs<MAX_WORK_HOURS) {
            int empWorkHrs=0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3; //to randomly generate num. 0 or 1
            switch (empCheck) {
                case IS_PRESENT_FULL_TIME:
                    empWorkHrs = 8;
                    break;
                case IS_PRESENT_HALF_TIME:
                    empWorkHrs = 4;
                    break;
                default:
                    empWorkHrs = 0;
                    break;
            }
            totalWorkHrs+=empWorkHrs;
            days++;
        }
        int totalSalary=WAGE_PER_HOUR * totalWorkHrs;
        return totalSalary;
    }
    public static void main(String[] args) {

        int totalSalary=computeEmpWage();
        System.out.println("Employee Monthly Wage is:"+totalSalary);
    }
}