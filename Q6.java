public class Q6 {
    public static void main(String[] args) {

        int arr[] = {1, 3, 1, 2, 5, 3, 2};
        Boolean flag = false;
        for (int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr.length; j++)
            {
                if(j!=i)
                {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag==false)
            {
                System.out.println(arr[i]);
                break;
            }
            flag=false;
        }
    }
}
