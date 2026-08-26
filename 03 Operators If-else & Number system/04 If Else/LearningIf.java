public class LearningIf {
    public static void main(String[] args) {
        System.out.println("....First If Else program....");
        boolean isSenior = true;
        boolean isAdult = false;

        if (isSenior) {
            System.out.println("Hello Senior Citizen ");

        } else {

            if (isAdult) {
                System.out.println("Hello Adult Citizen ");

            } else {
                System.out.println("Hello Child");
            }
        }
    }
}