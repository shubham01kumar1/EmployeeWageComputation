public class EmpWage {
    public static void main(String[] args) {
        final int IS_PRESENT_FULL_TIME=1;
        final int IS_PRESENT_HALF_TIME=2;
        final int WAGE_PER_HOUR=20;
        int empWorkHrs=0;
        int empWage=0;
        int empCheck=(int)Math.floor(Math.random()*10)%3; //to randomly generate num. 0 or 1

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
        empWage=WAGE_PER_HOUR * empWorkHrs;
        System.out.println("Employee's day wage is :"+empWage);
    }
}
