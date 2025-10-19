public class Interfaces {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();

    }
}
interface ChessPlayer {
    void moves();
}
class queen implements ChessPlayer {
    public void moves() {
        System.out.println("UP DOWN LEFT RIGHT DIAGONAL - ALL DIRECTION");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("UP DOWN LEFT RIGHT - 1 STEP");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("UP DOWN LEFT RIGHT - 1 STEP");
    }
}
