public class OrOperator {
    public  static void main() {
        System.out.println("OR Operator ");
        boolean adult= true;
        boolean  seniorCitizen=false;

        System.out.println("Check Your Are Eligible For Movie");
        if(adult || seniorCitizen){
            System.out.println("Your Are Eligible For Movie");
        }
        else {
            System.out.println("You Are Not Eligible For Moive");
        }
    }
}
