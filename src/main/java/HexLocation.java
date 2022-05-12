public class HexLocation extends Location{

    //hex direction is int <0; 5> where 0 is top-left, 1 top, 2 is top-right etc
    private final int hexDirection;

    public HexLocation(int xCoord, int yCoord, int hexDirection) {
        super(xCoord, yCoord);
        this.hexDirection = hexDirection;
    }

    public int getHexDirection() {
        return hexDirection;
    }

}
