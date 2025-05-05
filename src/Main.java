public class Main {
    public static void main(String[] args) {
        //my doubles
        double ballance = 5000.0;
        double interestRate = 0.17;

        //code
        System.out.println("Your current is ballance= " + ballance);
        System.out.println("Your interest is= " + "17%");

        //don't need to put double at top use in actule code
        double firstMonth = ballance * interestRate;
        System.out.println("Interest after one month= " + firstMonth);

        //do it again
        double secondMonth = firstMonth + (ballance * interestRate);
        System.out.println("Interest after two months= " + secondMonth);




    }
}