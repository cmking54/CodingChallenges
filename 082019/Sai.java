class Sai implements Left, Right, MoreRight {
    static int CHOICE = 0;
    public void speak() {
        switch (Sai.CHOICE) {
            case 0:
                System.out.println("\tI'm Sai"); break;
            case 1:
                Left.super.speak(); break;
            case 2:
                //Right.super.speak(); 
                break;
            case 3:
                MoreRight.super.speak(); break;
        }
    }

    public static void main(String[] args) {
        Sai boi = new Sai();
        for (int i = 0; i < 4; i++) {
            boi.speak();
            Sai.CHOICE++;
        }
    }
}

interface Left {
    default public void speak() {
        System.out.println("Left");
    }
}

interface Right {
    default public void speak() {
        System.out.println("\t\tRight");
    }
}
interface MoreRight extends Right {
    default public void speak() {
        System.out.println("\t\t\tMore Right");
    }
}
