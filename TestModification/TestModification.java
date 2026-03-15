public class TestModification {
    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {

            try {
                int x = 10 / 0;
            } 
            catch (ArithmeticException e) {
                System.out.println("Divide by zero error");
            }    
            catch (Exception e) {
                System.out.println("Caught exception");
            }

            try {
                int x = 10 / 0;
            } catch (Exception e) {
                System.out.println("Caught exception");
            }

        }

    }
}
