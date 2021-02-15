class overloading_ex
{
    int add(int operand1, int operand2)
    {
        return operand1+operand2;
    }
    double add(double operand1, double operand2)
    {
        return operand1+operand2;
    }
    int multiply(int operand1, int operand2)
    {
        return operand1*operand2;
    }
    float multiply(float operand1, float operand2)
    {
        return operand1*operand2;
    }
    String con(String str1, String str2)
    {
        return str1.concat(str2);
    }
    String con(String str1, String str2, String str3)
    {
        return str1.concat(str2.concat(str3));
    }
}

public class Q10
{
    public static void main(String args[])
    {
        overloading_ex obj = new overloading_ex();

        System.out.println("Addition of two integers: "+obj.add(10, 20));
        System.out.println("Addition of two double: "+obj.add(10.2, 20.3));
        System.out.println("Multiplication of two integers: "+obj.multiply(10, 20));
        System.out.println("Multiplication of two float: "+obj.multiply(10.25f, 20.3f));
        System.out.println("Concat of two strings: "+obj.con("Hello", " World"));
        System.out.println("Concat of two strings: "+obj.con("Java", " is", " cool"));
    }
}
