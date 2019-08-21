import java.util.*;
class Abdul {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1,1);
        System.out.println("Does 1 exist?");
        System.out.println("Yes it does! The value is: " + map.get(1));
        System.out.println("Does two exist?");
        try {
            map.get(2);
        } catch (Exception e) {
            System.out.println("No it does not! Try again");
        }
    }
}
