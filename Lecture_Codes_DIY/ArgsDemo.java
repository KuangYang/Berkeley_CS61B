public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int index = 0;
        while (index < args.length) {
            System.out.println(args[index]);
            index += 1;
        }
    }
}
