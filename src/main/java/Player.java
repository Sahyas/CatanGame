//At the start each player has declared color and starting values of his resources

public class Player {
    private int villages = 5;
    private int cities = 4;
    private int roads = 15;
    private int wood = 0;
    private int stone = 0;
    private int wheat = 0;
    private int clay = 0;
    private int wool = 0;
    private Color color;
    private int points = 0;


    public int getVillages() {
        return villages;
    }

    public int getCities() {
        return cities;
    }

    public int getRoads() {
        return roads;
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

    public Player(Color color) {
        this.color = color;
    }
}
