public class EmpWage {
    public static void main(String[] args) {
        int IS_PRESENT_FULL_TIME=1;
        int IS_PRESENT_HALF_TIME=2;
        int WAGE_PER_HOUR=20;
        int empWorkHrs=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3; //to randomly generate num. 0 or 1

        if(empCheck==IS_PRESENT_FULL_TIME)
            empWorkHrs=8;
        else if(empCheck==IS_PRESENT_HALF_TIME)
            empWorkHrs=4;
        else
            empWorkHrs=0;
        empWage=WAGE_PER_HOUR * empWorkHrs;
        System.out.println("Employee's day wage is :"+empWage);
    }
}
