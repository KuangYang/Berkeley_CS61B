import java.util.Iterator;

public class ArrayMapClient {
    public static void main(String[] args) {
        ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();
        am.put("hello", 5);
        am.put("syrups", 10);

        for (String s : am) {
            System.out.println(s);
        }

        //ArrayMap.MapWizard ami = am.new MapWizard();
        Iterator<String> ami = am.iterator();
        while (ami.hasNext()) {
            System.out.println(ami.next());
        }

        System.out.println(am.get("fdhdd"));
    }
}
