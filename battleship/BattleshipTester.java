package battleship;

import battleship.players.mkline_BattleshipPlayer;


/**
 * Created by matt 
 */
public class BattleshipTester {
    public static void main(String[] args) {
        mkline_BattleshipPlayer a = new mkline_BattleshipPlayer();
        mkline_BattleshipPlayer b = new mkline_BattleshipPlayer();

        Board aBoard = a.hideShips();
        System.out.println(aBoard);
        Board bBoard = b.hideShips();
        System.out.println(bBoard);
        a.reset();
        b.reset();

        int step = 1;

        for(int i = 0; i < 100; i++) {
            System.out.println("STEP " + step + " ================");
            bBoard.firedAtThisRound = false;
            a.go(bBoard);
            System.out.println(bBoard);
            aBoard.firedAtThisRound = false;
            b.go(aBoard);
            System.out.println(aBoard);
            if (aBoard.isComplete()) {
                System.out.println("B Wins!");
                break;
            }
            if (bBoard.isComplete()) {
                System.out.println("A Wins!");
                break;
            }
            step++;
        }
    }
}
