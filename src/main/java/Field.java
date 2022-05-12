public class Field {
    private int diceNumber;
    private final javaField fieldType;
    private Location location;

    public Field(javaField FieldType){
        this.fieldType = FieldType;
    }

    public int getDiceNumber() {
        return diceNumber;
    }

    public javaField getFieldType() {
        return fieldType;
    }

    public void setDiceNumber(int diceNumber) {
        this.diceNumber = diceNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(int x, int y) {
        this.location = new Location(x, y);
    }
}
