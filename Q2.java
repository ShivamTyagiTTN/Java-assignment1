public class Q2 {
    public static void main(String[] args) {

        String str = "Fear leads to anger, anger leads to hatred, hatred leads to conflict, conflict leads to suffering";
        String[] words = str.toLowerCase().split(" |\\, ");

        int count = 1;
        System.out.println("Duplicate words with number of occurrences: ");
        for (int i = 0; i < words.length; i++)
        {
            if (!words[i].equals("*"))
            {
                for (int j = i + 1; j < words.length; j++)
                {
                    if (words[i].equals(words[j])) {
                        count = count + 1;
                        words[j] = "*";
                    }
                }

                if(count>1)
                    System.out.println(words[i] + ": " + count);

                count = 1;
            }
        }
    }
}