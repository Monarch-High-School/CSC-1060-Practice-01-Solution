/**
 * Runner to test the page class
 * Solution - J. Cihlar January 2025
 */
class PageRunner {

    public static void main(String [] args) {

        System.out.println("Creating page 8.5 x 11 with 1.0 inch margins.");
        Page p = new Page(8.5, 11.0, 1.0);
        printPageDetails(p);
        System.out.println();

        System.out.println("Modifying margins.");
        p.setLeftMargin(0.5);
        p.setRightMargin(0.5);
        printPageDetails(p);

    }

    public static void printPageDetails(Page p) {
        int [] fontSizes = new int[] {10, 12, 14};
        System.out.printf("Width: %.1f\n", p.getWidth());
        System.out.printf("Height: %.1f\n", p.getHeight());
        System.out.printf("Top Margin: %.1f\n", p.getTopMargin());
        System.out.printf("Bottom Margin: %.1f\n", p.getBottomMargin());
        System.out.printf("Left Margin: %.1f\n", p.getLeftMargin());
        System.out.printf("Right Margin: %.1f\n", p.getRightMargin());
        System.out.printf("Printable Area: %.1f\n", p.getPrintableArea());
    
        for (int fs : fontSizes) {
            System.out.printf("Lines of text (%d pt): %d\n", fs, p.getLinesOfText(fs));
        }
        
        for (int fs : fontSizes) {
            System.out.printf("Words (%d pt): %d\n", fs, p.getWordsPerPage(fs));
        }
    }
}