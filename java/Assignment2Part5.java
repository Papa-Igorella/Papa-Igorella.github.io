package java;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;


public class Assignment2Part5 extends WindowProgram {

    /**
     * The default width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 500;

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 20;
    private static final int NUM_COLS = 26;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 2;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;


    // main program
    public void run() {
        getTheMatrix();

    }

    //Gets 3 rectangles, of which the flag consists
    private void getTheMatrix() {
        //Helper variables
        double colSize = ((NUM_ROWS  * BOX_SIZE) + (NUM_ROWS -1) * BOX_SPACING) ; // size of all boxes + box-spacing in column
        double rowSize = ((NUM_COLS  * BOX_SIZE) + (NUM_COLS -1) * BOX_SPACING) ; // size of all boxes + box-spacing in row
        double boxYOffset = 0;

        for (int i = 0; i < NUM_ROWS; i++) {
            double boxXOffset = 0;
            if (i > 0) {
                boxYOffset += BOX_SIZE + BOX_SPACING;
            }
            for (int j = 0; j < NUM_COLS; j++) {
                if (j > 0) {
                    boxXOffset += BOX_SIZE + BOX_SPACING;
                }
                // Getting the rectangles
                GRect rect = new GRect(((getWidth() - rowSize)/ 2.0) + boxXOffset, (getHeight() - colSize)/ 2.0 + boxYOffset ,BOX_SIZE,BOX_SIZE );
                rect.setFilled(true);
                rect.setFillColor(Color.black);
                add(rect);
            }
        }
    }
}

