public class EmpWage {
    public static void main(String[] args) {
        int PRESENT=1;
        int ABSENT=0;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
