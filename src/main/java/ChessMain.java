import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for( Player player : players){
            System.out.println(player);
        }
        HashMap<String,Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);


//        System.out.println("The player 1 name is " + whitePlayer.getName() + ", eMail: " + whitePlayer.getEmail() +
//        ", rank: " + whitePlayer.getRank() + ", age: " + whitePlayer.getAge());
//        System.out.println("The player 1 name is " + blackPlayer.getName() + ", eMail: " + blackPlayer.getEmail() +
//        ", rank: " + blackPlayer.getRank() + ", age: " + blackPlayer.getAge());
//        System.out.println(whitePlayer);
//        System.out.println(blackPlayer);


//        try{
//            whitePlayer.setRank(10000);
//        }
//        catch (IllegalArgumentException err) {
//            System.out.println("Please update rank to valid");
//        }
//        System.out.println(whitePlayer.getRank());
////        blackPlayer.setRank(-100);
//

    }
    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Bath Harmon", "bath.harmon@mail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@yandex.ru", false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }


    public HashMap<String,Piece> createPieces(){
        King whiteKing = new King(new Spot("H", 7),"white_king", true);
        King blackKing = new King(new Spot("D", 8), "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("A", 7), "white_Rook_1", true);
        Rook whiteRook2 = new Rook(new Spot("G", 7), "white_Rook_2", true);
        Knight blackKnight1 = new Knight(new Spot("D", 6), "black_knight", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(),whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight1.getId(), blackKnight1);
        return pieceHashMap;



    }


}
