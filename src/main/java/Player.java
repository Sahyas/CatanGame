//At the start each player has declared color and starting values of his resources

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int villagesAvailable = 5;
    private int citiesAvailable = 4;
    private int roadsAvailable = 15;
    private int wood = 0;
    private int stone = 0;
    private int wheat = 0;
    private int clay = 0;
    private int wool = 0;
    private Color color;
    private int points = 0;
    private List<Village> villages = new ArrayList<>();


    public Player(Color color) {
        this.color = color;
    }

    public void decreaseVillages(int number) {
        this.villagesAvailable -= number;
    }

    public void setCitiesAvailable(int citiesAvailable) {
        this.citiesAvailable = citiesAvailable;
    }

    public void setRoadsAvailable(int roadsAvailable) {
        this.roadsAvailable = roadsAvailable;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public void setWheat(int wheat) {
        this.wheat = wheat;
    }

    public void setClay(int clay) {
        this.clay = clay;
    }

    public void setWool(int wool) {
        this.wool = wool;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getVillagesAvailable() {
        return villagesAvailable;
    }

    public int getCitiesAvailable() {
        return citiesAvailable;
    }

    public int getRoadsAvailable() {
        return roadsAvailable;
    }

    public int getWood() {
        return wood;
    }

    public int getStone() {
        return stone;
    }

    public int getWheat() {
        return wheat;
    }

    public int getClay() {
        return clay;
    }

    public Color getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public int getWool() {return wool;}
}
