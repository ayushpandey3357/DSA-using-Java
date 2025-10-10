public class String_Function_Substring {
    public static String substring(String str, int start, int end) {
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
//        String str = "hello world" ;
//        System.out.println(str.substring(0,5));

        // same thing done by using for loop

        String str = "hello world";
        System.out.println(substring(str,0,5));
    }
}
