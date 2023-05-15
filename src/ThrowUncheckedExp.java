public class ThrowUncheckedExp {
    public void eligible(int age) throws ArithmeticException, IneligibleException {
        if (age < 18 && age > 0) {
            throw new IneligibleException("Less than 18");
        } else if (age < 0) {
            throw new ArithmeticException("Age is negative");
        } else {
            System.out.println("Eligible!!");
        }
    }
}
