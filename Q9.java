enum phone {
    Samsung(50000),Apple(70000),Xiaomi(15000),OnePlus(30000),realme(12000);
    private int price;
    phone(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Q9 {
    public static void main(String args[]){
        System.out.println("All Smartphone prices:\n");
        for (phone i : phone.values()) System.out.println(
                i + " costs ₹" + i.getPrice());
    }
}
