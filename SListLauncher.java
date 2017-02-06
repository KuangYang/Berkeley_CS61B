public class SListLauncher {
    public static void main(String[] args) {
        SSList<Integer> s1 = new SSList<Integer>(5);
        s1.insertFront(10);

        SSList<String> s2 = new SSList<String>("hi");
        s2.insertFront("apple");

        System.out.println(s2.getBack());
    }
}
