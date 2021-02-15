public class Q8 {
    public static void main(String[] args) {
        String str = "its not a bug its a feature";

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        sb.delete(4,9);

        System.out.println(sb);
    }
}
