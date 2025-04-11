public class Hello {

    public static void main(String[] args) {
        String name = getName();
        greet(name);
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        System.out.print("What is your name? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }
}