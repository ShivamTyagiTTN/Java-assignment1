import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        int[] array1 = {17, 22, 12, 43, 32};
        int[] array2 = {40, 17, 76, 32, 65};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < array1.length ; i++)
        {
            for(int j = 0 ; j < array2.length ; j++)
            {
                if (array1[i] == array2[j])
                    list.add(array1[i]);
            }
        }
        System.out.println("Repeated elements are: ");
        for(int i : list)
            System.out.print(i+" ");

    }
}
