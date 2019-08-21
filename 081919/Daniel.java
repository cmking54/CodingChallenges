class Daniel {
    public static void main(String[] args) {
        InnerClass class1 = new InnerClass();
        System.out.println(class1);
        System.out.println(((Object)class1).clone());
    }
}   
    class InnerClass {
        public int number = 0;
        public String name = "Me";
        @Override
        public String toString() {
            return "String: " + name + " Number: " + number;
        }
    }
