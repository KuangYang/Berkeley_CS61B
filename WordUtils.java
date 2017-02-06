public class WordUtils {

    /** Returns the length of the longest word. */
    public static String longest(List61B<String> list) {
        int maxIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            String longestString = list.get(maxIndex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                maxIndex = i;
            }
        }

        return list.get(maxIndex);
    }

    public static void main(String[] args) {
        SSList<String> someList = new SSList<String>();
        someList.insertBack("elk");
        someList.insertBack("are");
        someList.insertBack("watching");

        System.out.println(WordUtils.longest(someList));

        someList.print();

    }


}
