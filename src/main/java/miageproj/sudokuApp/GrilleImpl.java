/**
 * 
 */
package com.miageprojet.app;

/**
 * Implementation de l'interface Grille
 */
public class GrilleImpl implements Grille {

    public static void main(String args[]) {
        new GrilleImpl(new char[][] {
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'},
{'@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@'}
        }).solve();
    }

    private char sudoku[][];
    //private char initialGrille[][];
    private int n = 0;
  
  public  int getDimension(){
  
    return sudoku[0].length;
  
  }

    public GrilleImpl(char sudoku[][]) {
        this.sudoku = sudoku;
    }

    public void solve() {
      
        n = getDimension();

        if (!complete()) {
            System.out.println("Ce sudoku ne peut etre resolu.");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean possible(int i, int j, char x) throws IllegalArgumentException {

        // Is 'x' used in row.
      //System.out.println("Ce sudoku ne peut etre resolu. 1" );
        for (int jj = 0; jj < n; jj++) {
            if (sudoku[i][jj] == x) {
              
                return false;
            }
          
        }

        // Is 'x' used in column.
        for (int ii = 0; ii < n; ii++) {
            if (sudoku[ii][j] == x) {
                return false;
            }
        }

        // Is 'x' used in 3x3 or 4x4 boxes.
      int sqrt = (int) Math.sqrt(n);
        int boxRow = i - i % sqrt;
        int boxColumn = j - j % sqrt;

        for (int ii = 0; ii < sqrt; ii++) {
            for (int jj = 0; jj < sqrt; jj++) {
                if (getValue(boxRow + ii, boxColumn + jj) == x) {
                //if (sudoku[boxRow + ii][boxColumn + jj] == x) {
                    return false;
                }
            }
        }

        // Everything looks good.
        return true;
    }

    public boolean complete() {
        int i = 0, j = 0;
        boolean estCeCelluleVide = false;

        for (int ii = 0; ii < n && !estCeCelluleVide; ii++) {
            for (int jj = 0; jj < n && !estCeCelluleVide; jj++) {
                if (getValue(ii, jj) == EMPTY) {
                    estCeCelluleVide = true;
                    i = ii;
                    j = jj;
                }
            }
        }

        // Termine.
        if (!estCeCelluleVide) {
            return true;
        }

        for (int x = 0; x < n; x++) {

            if (possible(i, j, possible[x])) {
                setValue(i, j, possible[x]);
                //sudoku[i][j] = possible[x];

                if (complete()) {
                    return true;
                }

                sudoku[i][j] = EMPTY; // Echec.
            }

        }

        return false; // Imcomplete
    }
  
  
  public void setValue(int x, int y, char value) throws IllegalArgumentException {
    
            if (possible(x, y, value)) {
                sudoku[x][y] = value;
                
            }
  
  }
  
  public char getValue(int x, int y) throws IllegalArgumentException {
  
    return sudoku[x][y];
  
  }
  
  
}
