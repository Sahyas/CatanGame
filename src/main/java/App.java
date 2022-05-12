public class App {
    public static void main(String[] args){
        Board board = new Board();
        for(int i = 0; i < Board.FieldsSIZE; i ++){
            System.out.print(board.getFields().get(i).getLocation().getxCord() + ", ");
            System.out.print(board.getFields().get(i).getLocation().getyCord() + ", ");
            System.out.print(board.getFields().get(i).getDiceNumber() + ", ");
            System.out.println(board.fields.get(i).getFieldType());
        }
    }
}
