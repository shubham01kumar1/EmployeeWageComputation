public class EmpWage {
    public static void main(String[] args) {
        final int IS_PRESENT_FULL_TIME=1;
        final int IS_PRESENT_HALF_TIME=2;
        final int WAGE_PER_HOUR=20;
        final int MAX_WORK_DAYS=20;
        int totalSalary=0;

        for(int i=1;i<=MAX_WORK_DAYS;i++) {
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
            totalSalary+= WAGE_PER_HOUR * empWorkHrs;
        }
        System.out.println("Employee Monthly Wage is:"+totalSalary);
    }
}
