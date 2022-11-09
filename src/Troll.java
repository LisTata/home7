public class Troll {
    public static void main(String[] args) {

        System.out.println(disemvowel("No offense but,Your writing is among the worst I've ever read"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
    