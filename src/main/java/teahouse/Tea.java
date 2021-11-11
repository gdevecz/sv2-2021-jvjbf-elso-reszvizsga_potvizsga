package teahouse;

public class Tea {

    private String name;

    private int price;

    private Sort sort;

    public Tea(String name, int cost, Sort sort) {
        this.name = name;
        this.price = cost;
        this.sort = sort;
    }


    @Override
    public String toString() {
        return String.format("%s: %s (%d Ft)", name,sort.additionalInfo(), price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Sort getSort() {
        return sort;
    }
}
