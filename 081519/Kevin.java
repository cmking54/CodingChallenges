class Kevin {
    public static void main(String[] args) {
        Shelter sh = new Shelter();
        System.out.println("Total in shelter: " + sh.total);
        System.out.println("Dogs in shelter: " + sh.dogs);
        System.out.println("Cats in shelter: " + sh.cats);
        System.out.println("Huskies: " + sh.new Dog().new Husky().numOfBreed);
        System.out.println("Non - Huskies: " + (sh.dogs - sh.new Dog().new Husky().numOfBreed));
    }
}
class Shelter {
    int dogs = 20, cats = 30, total = dogs + cats;
    class Dog {
        class Husky {
            int numOfBreed = 8;
        }
    }
}
            
