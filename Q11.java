class Bank{
    int getDetails() {
        return 7;
    }

}
class SBI extends Bank{
    int getDetails() {
        return 9;
    }

}

class BOI extends Bank{
    int getDetails() {
        return 8;
    }

}

class ICICI extends Bank{
    int getDetails() {
        return 12;
    }

}


public class Q11 {
    public static void main(String[] args) {
        Bank b=new Bank();
        SBI s=new SBI();
        BOI bo=new BOI();
        ICICI i=new ICICI();

        System.out.println("Bank Rate of Interest: "+b.getDetails());
        System.out.println("SBI Rate of Interest: "+s.getDetails());
        System.out.println("BOI Rate of Interest: "+bo.getDetails());
        System.out.println("ICICI Rate of Interest: "+i.getDetails());
    }
}
