/**
 * 
 * Solution file for the Page class.
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-01
 */

public class Page {
    /** the page width in inches */
    private double width;

    /** the page height in inches */
    private double height;

    /** the top margin in inches */
    private double topMargin;

    /** the bottom margin in inches */
    private double bottomMargin;

    /** the left margin in inches */
    private double leftMargin;

    /** the right margin in inches */
    private double rightMargin;

    /**
     * Constructor. Sets margins to a uniform measurement.
     * @param w The page width in inches
     * @param h The page height in inches
     * @param m The value to set
     */
    public Page(double w, double h, double m) {
        width = w;
        height = h;
        topMargin = bottomMargin = leftMargin = rightMargin = m;
    }

    /**
     * Constructor. Sets margins individually.
     * @param w The page width in inches
     * @param h The page height in inches
     * @param top The top margin in inches
     * @param bottom The bottom margin in inches
     * @param left The left margin in inches
     * @param right The right margin in inches
     */
    public Page(double w, double h, double top, double bottom, double left, double right) {
        width = w;
        height = h;
        topMargin = top;
        bottomMargin = bottom;
        leftMargin = left;
        rightMargin = right;
    }

    /**
     * Getter for the page width
     * @return double The page width in inches
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getter for the page height
     * @return double The page height in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Getter for the top margin
     * @return double The top margin in inches
     */
    public double getTopMargin() {
        return topMargin;
    }   
 
    /**
     * Getter for the bottom margin
     * @return double The bottom margin in inches
     */
    public double getBottomMargin() {
        return bottomMargin;
    }   
    /**
     * Getter for the left margin
     * @return double The left margin in inches
     */
    public double getLeftMargin() {
        return leftMargin;
    }   

    /**
     * Getter for the right margin
     * @return double The right margin in inches
     */
    public double getRightMargin() {
        return rightMargin;
    }   

    /**
     * Setter for width
     * @param w double The new width in inches
     */
    public void setWidth(double w) {
        width = w;
    }

    /**
     * Setter for height
     * @param h double The new height in inches
     */
    public void setHeight(double h) {
        height = h;
    }
   
    /**
     * Setter for topMargin
     * @param top double The new top margin in inches
     */
    public void setTopMargin(double top) {
        topMargin = top;
    }

    /**
     * Setter for bottomMargin
     * @param bottom double The new bottom margin in inches
     */
    public void setBottomMargin(double bottom) {
        bottomMargin = bottom;
    }
    /**
     * Setter for leftMargin
     * @param left double The new left margin in inches
     */
    public void setLeftMargin(double left) {
        leftMargin = left;
    }    

    /**
     * Setter for rightMargin
     * @param right double The new right margin in inches
     */
    public void setRightMargin(double right) {
        rightMargin = right;
    } 
    /**
     * Calculates the printable area
     * @return double 
     */
    public double getPrintableArea() {
        return (width - (leftMargin+rightMargin)) * (height - (topMargin + bottomMargin));
    }

    /**
     * Calculates the number of lines that can fit into the printable area.
     * @param fontSize The font size of the lines
     * @return int The number of lines that can fit into the printable area
     */
    public int getLinesOfText(int fontSize) {
        return (int)(72.0 / fontSize * (height - (topMargin + bottomMargin)));
    }

    /**
     * Calculates the number of words that can fit into the printable area.
     * @param fontSize The font size of the words
     * @return int The number of words that can fit into the printable area
     */
    public int getWordsPerPage(int fontSize) {
        return (int)(72.0 / fontSize * getPrintableArea());
    }
 }