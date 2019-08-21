class Josiah {
    public static void main (String[] args) {
        Dog husky = new Dog("Laura", "Miller");
        Dog husky1 = new Dog(husky);

        husky1.name = "Lady";
        husky1.ownerName = "King";
        System.out.println("My Dog: " + husky1);
        System.out.println("Her Mother: " + husky);
    }
}
class Dog {
    public String name, ownerName;
    Dog(String name, String owner) {
        this.name = name;
        this.ownerName = owner;
    }
    Dog(Dog other) {
        this(other.name, other.ownerName);
    }
    @Override
    public String toString() {
        return name + " " + ownerName;
    }
}        
