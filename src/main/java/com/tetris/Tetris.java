package com.tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Tetris extends JFrame {

    private JLabel statusbar;

    public Tetris() {
        
        initUI();
   }
    
   private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);       
   }

   public JLabel getStatusBar() {
       
       return statusbar;
   }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                Tetris game = new Tetris();
                game.setVisible(true);
            }
        });                
    } 
}


/*

C:\Workspaces\Git\Java\Tetris-Game>tree
Folder PATH listing
Volume serial number is 4468-0AA6
C:.
├───build
│   └───classes
└───src
    ├───main
    │   ├───java
    │   │   ├───build
    │   │   │   └───classes
    │   │   └───com
    │   │       └───tetris
    │   └───resources
    └───test
        ├───java
        └───resources
	
dattan1@WD4BED99C9B68 /c/Workspaces/Git/Java/Tetris-Game
$ pwd
/c/Workspaces/Git/Java/Tetris-Game

dattan1@WD4BED99C9B68 /c/Workspaces/Git/Java/Tetris-Game
$ javac -sourcepath src/main/java -d build/classes src/main/java/com/tetris/Tetris.java

C:\Workspaces\Git\Java\Tetris-Game>tree
Folder PATH listing
Volume serial number is 4468-0AA6
C:.
├───build
│   └───classes
│       └───com
│           └───tetris
└───src
    ├───main
    │   ├───java
    │   │   ├───build
    │   │   │   └───classes
    │   │   └───com
    │   │       └───tetris
    │   └───resources
    └───test
        ├───java
        └───resources
		
dattan1@WD4BED99C9B68 /c/Workspaces/Git/Java/Tetris-Game
$ java -cp build/classes/ com.tetris.Tetris
	
*/