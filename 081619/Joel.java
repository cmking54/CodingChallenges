class Joel {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
            //throw new ArrayIndexOutOfBoundsException(); // Comment one out at a time
        } catch (ArithmeticException e) {
            System.out.println("Caught 'em");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Got 'em");
        } finally { System.out.println("Goodbye!"); }
    }
}
