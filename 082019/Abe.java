import java.util.function.BiFunction;
class Abe {
    public static void main(String[] args) {
        BiFunction<String, String, String> anonymous = (fn, ln) -> {return String.format("%s %s", fn, ln);};
        System.out.println(anonymous.apply("Chris", "King"));
    }
}       
