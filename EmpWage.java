public class EmpWage {
    public static void main(String[] args) {
        int IS_PRESENT=1;
        int WAGE_PER_HOUR=20;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%2; //to randomly generate num. 0 or 1


        if(empCheck==IS_PRESENT) {
            int empHrs = 8;
            empWage = WAGE_PER_HOUR * empHrs;
        }
        else
            empWage=0;
        System.out.println("Employee daily wage is :"+empWage);
    }
}
