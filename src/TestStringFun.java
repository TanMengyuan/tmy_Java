public class TestStringFun {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        char n_index = s.charAt(0);
        boolean is_equal = s.equals("abcdefghijklmnopqrstuvwxyz");
        boolean is_equal2 = s.equalsIgnoreCase("abcdeFghijkLmnopqrstuvwxyz");
        int index_of_s = s.indexOf('g');
        int last_index = s.lastIndexOf('l');
        int length = s.length();
        boolean start_with = s.startsWith("abc");
        String new_s = s.toUpperCase();
        System.out.println(n_index);
        System.out.println(is_equal);
        System.out.println(is_equal2);
        System.out.println(index_of_s);
        System.out.println(last_index);
        System.out.println(length);
        System.out.println(start_with);
        System.out.println(new_s);
    }
}
