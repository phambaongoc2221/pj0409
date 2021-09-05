package entity;

public class Food {
    private int ID;
    private String title;
    private String img;
    private double price;
    private String script;

    public Food() {

    }

    public Food(int ID, String title, String img, double price, String script) {
        this.ID = ID;
        this.title = title;
        this.img = img;
        this.price = price;
        this.script = script;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "Food{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", script='" + script + '\'' +
                '}';
    }
}
