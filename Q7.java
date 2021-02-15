public class Q7
{
    static String firstName;
    static{
        firstName = "Shivam";
    }

    static String lastName()
    {
        return "Tyagi";
    }

    static int Age = 23;

    public static void main (String[] args)
    {
        System.out.println("First Name: "+firstName+"\nLastName: "+Q7.lastName() +"\nAge: "+Age);
    }
}