// Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer

public class Q8 {
    public static void main(String[] args) {
        String str = "its not a bug its a feature";

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        sb.delete(4,9);

        System.out.println(sb);
    }
}
