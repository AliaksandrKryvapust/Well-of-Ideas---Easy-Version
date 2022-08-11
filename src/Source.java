public class Source {
    public static void main(String[] args) {
        String[] str = new String[]{"good", "bad", "bad", "bad", "bad"};
        System.out.println(well(str).equals("Publish!"));
    }

    public static String well(String[] x) {
        int count = 0;
        for (String str : x) {
            if (str.equals("good")) {
                count++;
            }
        }
        return (count == 0) ? "Fail!" : (count < 3) ? "Publish!" : "I smell a series!";
    }
}
