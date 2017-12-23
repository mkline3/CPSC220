/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship.players;

import battleship.Board;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
/**
 *
 * @author Matt
 */
public class mkline_BattleshipPlayer implements BattleshipPlayer {
     public Board hideShips() {
       
       
        int row = Board.HEIGHT;
        int col = Board.WIDTH;
        char[][] contents = new char[row][col];
        
        for(int i = 0; i<row ; i++){
            for(int j = 0; j<col; j++){
                contents[i][j] = ' ';
            }
        }
         char[] aircraft = {'A', 'A', 'A', 'A', 'A'};
         char[] battleship = {'B', 'B', 'B', 'B'};
         char[] submarine = {'S', 'S', 'S'};
         char[] destroyer = {'D', 'D', 'D'};
         char[] patrol = {'P', 'P'};
         char[][] ships = {aircraft, battleship, submarine, destroyer, patrol};
         int r =  (Math.random() <= .5) ? 1 : 2;
               for(int B = 0; B <1; B++){   
                  int count= 0;
                if(r == 1){
                    int x = (int) (10*Math.random());
                    int y = 0;
                    if(x <= 6){
                      for(int i = x; i<10; i++){
                          x = i;
                          contents[x][y] = 'B';
                         count++;   
                 if(count == battleship.length)
                          break;   
                      } 
                    }
                    else{
                        for(int i = x; i>0; i--){
                          x = i;
                          contents[x][y] = 'B';
                         count++;
                 if(count == battleship.length)
                          break;   
                      }  
                    }
                   }
                else{
                    int x = 0;
                    int y = (int) (10*Math.random());
                     if(y <= 6){   
                      for(int i = y; i<10; i++){
                          y = i;
                          contents[x][y] = 'B';
                         count++; 
                 if(count == battleship.length)
                          break;  
                      }
                    }
                    else{
                        for(int i = y; i>0; i--){
                          y = i;
                          contents[x][y] = 'B';
                          count++;
                 if(count == battleship.length)
                          break; 
                      }  
                }
             }
           }
        for(int A = 0; A <1; A++){   
                  int count= 0;
                if(r == 1){
                    int x = (int) (10*Math.random());
                    int y = 5;
                    if(x <= 5){
                      for(int i = x; i<10; i++){
                          x = i;
                          contents[x][y] = 'A';
                         count++;   
                 if(count == aircraft.length)
                          break;   
                      } 
                    }
                    else{
                        for(int i = x; i>0; i--){
                          x = i;
                          contents[x][y] = 'A';
                         count++;
                 if(count == aircraft.length)
                          break;   
                      }  
                    }
                   }
                else{
                    int x = 5;
                    int y = (int) (10*Math.random());
                     if(y <= 5){   
                      for(int i = y; i<10; i++){
                          y = i;
                          contents[x][y] = 'A';
                         count++; 
                 if(count == aircraft.length)
                          break;  
                      }
                    }
                    else{
                        for(int i = y; i>0; i--){
                          y = i;
                          contents[x][y] = 'A';
                          count++;
                 if(count == aircraft.length)
                          break; 
                      }  
                }
             }
           }
                for(int S = 0; S <1; S++){   
                  int count= 0;
                if(r == 1){
                    int x = (int) (10*Math.random());
                    int y = 9;
                    if(x <= 7){
                      for(int i = x; i<10; i++){
                          x = i;
                          contents[x][y] = 'S';
                         count++;   
                 if(count == submarine.length)
                          break;   
                      } 
                    }
                    else{
                        for(int i = x; i>0; i--){
                          x = i;
                          contents[x][y] = 'S';
                         count++;
                 if(count == submarine.length)
                          break;   
                      }  
                    }
                   }
                else{
                    int x = 9;
                    int y = (int) (10*Math.random());
                     if(y <= 7){   
                      for(int i = y; i<10; i++){
                          y = i;
                          contents[x][y] = 'S';
                         count++; 
                 if(count == submarine.length)
                          break;  
                      }
                    }
                    else{
                        for(int i = y; i>0; i--){
                          y = i;
                          contents[x][y] = 'S';
                          count++;
                 if(count == submarine.length)
                          break; 
                      }  
                }
             }
           }
              for(int D = 0; D <1; D++){   
                  int count= 0;
                if(r == 1){
                    int x = (int) (10*Math.random());
                    int y = 4;
                    if(x <= 7){
                      for(int i = x; i<10; i++){
                          x = i;
                          contents[x][y] = 'D';
                         count++;   
                 if(count == destroyer.length)
                          break;   
                      } 
                    }
                    else{
                        for(int i = x; i>0; i--){
                          x = i;
                          contents[x][y] = 'D';
                         count++;
                 if(count == destroyer.length)
                          break;   
                      }  
                    }
                   }
                else{
                    int x = 4;
                    int y = (int) (10*Math.random());
                     if(y <= 7){   
                      for(int i = y; i<10; i++){
                          y = i;
                          contents[x][y] = 'D';
                         count++; 
                 if(count == destroyer.length)
                          break;  
                      }
                    }
                    else{
                        for(int i = y; i>0; i--){
                          y = i;
                          contents[x][y] = 'D';
                          count++;
                 if(count == destroyer.length)
                          break; 
                      }  
                }
             }
           }
            for(int P = 0; P <1; P++){   
                  int count= 0;
                if(r == 1){
                    int x = (int) (10*Math.random());
                    int y = r;
                    if(x <= 8){
                      for(int i = x; i<10; i++){
                          x = i;
                          contents[x][y] = 'P';
                         count++;   
                 if(count == patrol.length)
                          break;   
                      } 
                    }
                    else{
                        for(int i = x; i>0; i--){
                          x = i;
                          contents[x][y] = 'P';
                         count++;
                 if(count == patrol.length)
                          break;   
                      }  
                    }
                   }
                else{
                    int x = r;
                    int y = (int) (10*Math.random());
                     if(y <= 8){   
                      for(int i = y; i<10; i++){
                          y = i;
                          contents[x][y] = 'P';
                         count++; 
                 if(count == patrol.length)
                          break;  
                      }
                    }
                    else{
                        for(int i = y; i>0; i--){
                          y = i;
                          contents[x][y] = 'P';
                          count++;
                 if(count == patrol.length)
                          break; 
                      }  
                }
             }
           }    
             
          
       
        
        Board b = null;
        try {
            b = new Board(contents);
        } catch (Exception ex) {
            Logger.getLogger(mkline_BattleshipPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
               
       return b; 
    }

    ArrayList<String>Hit = new ArrayList<>();
    /**
     * go - This method is called repeatedly throughout the game, every
     * time it's your turn.
     *
     * When it's your turn, and go() is called, you must call fireAt() on
     * the Board object which is passed as a parameter. You must do this
     * exactly *once*: trying to fire more than once during your turn will
     * be detected as cheating.
     * @param opponentsBoard
     */
    public void go(Board opponentsBoard) {
        int row = Board.HEIGHT;
        int col = Board.WIDTH;
        char[][] contents = new char[row][col];
        String m = "miss";
        String h = "hit";
        for(int i = 0; i<row ; i++){
            for(int j = 0; j<col; j++){
                contents[i][j] = ' ';
            }
        }
     int x = 0;
     int y = 0;
  
    
    boolean newTarget = false;
    while(newTarget == false){
        newTarget = true;
         x = (int) (10*Math.random());
         y = (int) (10*Math.random());
        
        String target = Integer.toString(x) + Integer.toString(y);
     if(Hit.contains(target)){
         newTarget = false;
     }
     else{
         newTarget = true;
         Hit.add(target);
     }
     }
     char targetRevealed = opponentsBoard.fireAt(x,y);
     if(targetRevealed == ' ')
         System.out.println(m);
     else
         System.out.println(h);
    }
    

    /**
     * reset - This method is called when a game has ended and a new game
     * is beginning. It gives you a chance to reset any instance variables
     * you may have created, so that your BattleshipPlayer starts fresh.
     */
    public void reset() {
        Hit.clear();
    }
}


