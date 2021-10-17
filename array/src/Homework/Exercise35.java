package Homework;

public class Exercise35 {

    public static void print(Goods[] goods) {
        for (Goods item : goods) {
            System.out.println(item);
        }
    }

    public static void finalPrize(Goods[] goods) {
        for (Goods item : goods) {
            if (item.getPrize()*item.getDiscount() > 200) System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Goods[] goods = {
                new Goods(1,"mouse","001", 99, 0.9),
                new Goods(2,"toy","002",403,0.7),
                new Goods(3,"programme","003",89,0.8),
                new Goods(4,"suit","004",700,0.5),
                new Goods(5,"phone","005",900,0.3),
        };

        print(goods);
        finalPrize(goods);
    }

}

class Goods {
    private int id;
    private String name;
    private String type;
    private int prize;
    private double discount;

    public Goods(int id, String name, String type, int prize, double discount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.prize = prize;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", prize=" + prize +
                ", discount=" + discount +
                '}';
    }
}
