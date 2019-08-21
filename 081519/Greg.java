class Greg {
    static class C {
        static void output_C() {
            System.out.println("C");
        }
    }
    public static void main(String[] args) {
        C.output_C();
        new A() {
            public void output_A() { System.out.println("A"); }
            public void output_B() { System.out.println("B"); }
            public void output() { output_B(); output_A(); }
        }.output();
    }
}
interface A {
    void output_A();
    interface B {
        void output_B();
    }
}
