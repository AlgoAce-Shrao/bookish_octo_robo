public class App {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No command provided");
            return;
        }

        String command = args[0];

        switch (command) {
            case "greet":
                System.out.println("Hello " + args[1]);
                break;

            case "add":
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                System.out.println("Sum: " + (a + b));
                break;

            default:
                System.out.println("Unknown command");
        }
    }
}