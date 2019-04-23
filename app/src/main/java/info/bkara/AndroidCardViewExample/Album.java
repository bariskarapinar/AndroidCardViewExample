package info.bkara.AndroidCardViewExample;

public class Album {
    private String name;
    private int numOfCars;
    private int thumbnail;

    public Album() {
    }

    public Album(String name, int numOfCars, int thumbnail) {
        this.name = name;
        this.numOfCars = numOfCars;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfCars() {
        return numOfCars;
    }

    public void setNumOfCars(int numOfCars) {
        this.numOfCars = numOfCars;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
