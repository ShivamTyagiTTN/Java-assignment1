public class Q3
{
    public static void main(String[] args)
    {
        String str = "the best error message is the one that never shows up";
        String s = "e";
        int count = str.length() - str.replace(s, "").length();
        System.out.println("Number of occurrences of "+s+" = "+count);
    }
}
