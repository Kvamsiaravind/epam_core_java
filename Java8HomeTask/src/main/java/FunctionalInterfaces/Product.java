package FunctionalInterfaces;

public class Product {
    private String category;
    private String name;
    private double price;
    private String grade;

    public Product(String category, String name, double price, String grade) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public Product() {

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
