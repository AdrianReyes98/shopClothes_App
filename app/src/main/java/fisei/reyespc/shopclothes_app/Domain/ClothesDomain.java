package fisei.reyespc.shopclothes_app.Domain;

public class ClothesDomain {

    private String title;
    private String pic;
    private String description;
    private Double free;
    private int star;
    private int time;
    private int brand;

    public ClothesDomain(String title, String pic, String description, Double free, int star, int time, int brand) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.free = free;
        this.star = star;
        this.time = time;
        this.brand = brand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }
}
