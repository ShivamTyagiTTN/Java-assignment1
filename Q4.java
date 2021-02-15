import java.text.DecimalFormat;

public class Q4 {
    public static void main(String[] args) {

        float upper = 0, lower = 0, number = 0, special = 0;
        String str = "To The New id = 1001 & abc@gmail.com";

        DecimalFormat df = new DecimalFormat("0.00");
        for(int i = 0 ; i < str.length() ; i++)
        {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                upper++;
            else if (c >= 'a' && c <= 'z')
                lower++;
            else if (c >= '0' && c <= '9')
                number++;
            else if(c != ' ')
                special++;
        }

        int total = (int)(upper+lower+number+special);

        System.out.println("Total Characters: "+total);
        System.out.println("Upper: " +df.format( upper/total*100)+"%");
        System.out.println("Lower: " +df.format(lower/total*100)+"%");
        System.out.println("Number: " +df.format(+number/total*100)+"%");
        System.out.println("Special: " +df.format(+special/total*100)+"%");

    }
}
