public class Q1 {
    public static void main(String[] args) {
        String str = "This is a test string";
        String substr = "a test";
        String replace_string = "an example";

        System.out.println("Old String: "+str);
        String result = str.replace(substr, replace_string);

        System.out.println("New String: "+result);
    }
}
