 class exception {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            int result = 10 / 0; // This will cause ArithmeticException
            String str = null;
            str.length(); // This will cause NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
