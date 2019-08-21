import java.util.Scanner;
class Matthew {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("stop"))
                    break;
                int vowels = 0, upper = 0;
                for (char c: line.toCharArray()) {
                    if ("aeiouAEIOU".indexOf(c) >= 0) {
                        vowels++;
                        if (Character.isUpperCase(c))
                            upper++;
                    }
                }
                System.out.println("Vowels: " + vowels);
                System.out.println("\tUppercase: " + upper);
            }
        } catch (Exception e) { }
        finally {sc.close(); }
    }
}    
