
public class A1 {
    public static void main(String[] args) {
        System.out.println("House Prices ");
        for(HousePrice hp:HousePrice.values())
        {
            System.out.println(hp+" "+hp.getPrice());
        }}}
enum HousePrice {
    BHK1(10000),
    BHK2(15000),
    BHK3(20000);

    private final int price;
    HousePrice(int price)
    {this.price=price;}
    public int getPrice()
    {
        return price;
    }}

