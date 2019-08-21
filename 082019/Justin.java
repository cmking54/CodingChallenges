class Justin {
    public static void main(String[] args) {
        DefaultTester dc = () -> System.out.println("Honk");
        System.out.println("How many cars do you have in your garage: " + dc.getCars());
        if (dc.getCars() > 0)
            System.out.println("Wow that's a lot of cars!");
        else
            System.out.println("Walk, then.");       
        dc.beep();
    }
}
interface DefaultTester {
    int cars = 100; 
    void beep();
    default int getCars() {
        return cars;
    }
}
