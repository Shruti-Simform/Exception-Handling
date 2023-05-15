import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        try {
            ThrowUncheckedExp t = new ThrowUncheckedExp();
            t.eligible(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred : " + e);
        } catch (IneligibleException e) {
            System.out.println("Ineligible!!");
            System.out.println(e);
        } finally {
            System.out.println("---Eligibility process finished---");
        }
    }
}


