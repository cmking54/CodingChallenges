import java.util.regex.*;
class Roy {
    private static String matchAndChange(String input, String pattern, String change) {
        int start = -1;
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(input);
        while (matcher.find(start+1)) {
            int end = matcher.end();
            System.out.println();
            start = end;
        }
        return matcher.replaceAll(change);
    }
    public static void main(String[] args) {
        String input = "";
        String new_input = Roy.matchAndChange(input, 
        start = -1;
        pattern = Pattern.compile("(UAG|UAA|UGA)");
        matcher = pattern.matcher(new_input);
        while (matcher.find(start+1)) {
            int end = matcher.end();
            System.out.println();
            start = end;
        }
        String newer_input = matcher.replaceAll("*");

        
