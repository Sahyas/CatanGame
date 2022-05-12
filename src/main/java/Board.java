//Class responsible for creating randomly placed fields on the board. The positions of those fields cannot be
//changed and number of them is constant and equals 54

import java.util.*;


public class Board {
    public static final int FieldsSIZE = 19;
    private List<Integer> tile = new ArrayList<>();
    List<Field> fields = new ArrayList<>();

    public List<Field> getFields() {
        return fields;
    }

    public Board() {
        //adding all types of fields on board
        fields.add(new Field(javaField.Wood)); fields.add(new Field(javaField.Wood)); fields.add(new Field(javaField.Wood)); fields.add(new Field(javaField.Wood));
        fields.add(new Field(javaField.Clay)); fields.add(new Field(javaField.Clay)); fields.add(new Field(javaField.Clay));
        fields.add(new Field(javaField.Stone));fields.add(new Field(javaField.Stone));fields.add(new Field(javaField.Stone));
        fields.add(new Field(javaField.Wheat));fields.add(new Field(javaField.Wheat));fields.add(new Field(javaField.Wheat));fields.add(new Field(javaField.Wheat));
        fields.add(new Field(javaField.Wool));fields.add(new Field(javaField.Wool));fields.add(new Field(javaField.Wool));fields.add(new Field(javaField.Wool));
        fields.add(new Field(javaField.Desert));

        //randomizing fields
        Collections.shuffle(fields);

        //creating random dice numbers
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8,
                9, 9, 10, 10, 11, 11, 12));
        Collections.shuffle(randomNumbers);
        int counter = 0;
        for (Field field : fields) {
            if (!(field.getFieldType().equals(javaField.Desert))) {
                field.setDiceNumber(randomNumbers.get(counter));
                counter++;
            } else {
                field.setDiceNumber(0);
            }
        }

        //assigning coordinates to fields
        for(int i = 0; i < 3; i ++){
            fields.get(i).setLocation(0, i);
        }
        for(int i = 0; i < 4; i ++){
            fields.get(i + 3).setLocation(1, i);
        }
        for(int i = 0; i < 5; i ++){
            fields.get(i + 7).setLocation(2, i);
        }
        for(int i = 0; i < 4; i ++){
            fields.get(i + 12).setLocation(3, i);
        }
        for(int i = 0; i < 3; i ++){
            fields.get(i + 16).setLocation(4, i);
        }
    }
}
