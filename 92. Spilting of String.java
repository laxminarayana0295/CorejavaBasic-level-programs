public class Main {
    public static void main(String[] args) {
        String string = "Hello\nWorld\nJava";
        String[] lines = string.split("\n");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
