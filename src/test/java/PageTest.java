import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PageTest {

    private Page page3Arg;
    private Page page6Arg;
    private int[] fontSizes = new int[]{10, 12, 14};
    private static final double DELTA = 1e-6; // Tolerance for floating-point comparison

    @BeforeEach
    public void setUp() {
            // create two different pages to test
        page3Arg = new Page(8.5, 11, 1.0);
        page6Arg = new Page(8.5, 11, 1.0, 1.0, 0.75, 0.75);

    }

    @Test
    public void testGetWidth3Arg() {
        double expected = 8.5;
        assertEquals(expected, page3Arg.getWidth(), DELTA, "The width for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetHeight3Arg() {
        double expected = 11.0;
        assertEquals(expected, page3Arg.getHeight(), DELTA, "The height for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetTopMargin3Arg() {
        double expected = 1.0;
        assertEquals(expected, page3Arg.getTopMargin(), DELTA, "The top margin for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetBottomMargin3Arg() {
        double expected = 1.0;
        assertEquals(expected, page3Arg.getBottomMargin(), DELTA, "The bottom margin for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetLeftMargin3Arg() {
        double expected = 1.0;
        assertEquals(expected, page3Arg.getLeftMargin(), DELTA, "The left margin for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetRightMargin3Arg() {
        double expected = 1.0;
        assertEquals(expected, page3Arg.getRightMargin(), DELTA, "The right margin for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetPrintableArea3Arg() {
        double expected = 58.5;
        assertEquals(expected, page3Arg.getPrintableArea(), DELTA, "The printable area for the 3-arg constructor should be " + expected);
    }

    @Test
    public void testGetLines3Arg() {
        double[] expected = new double[]{64, 54, 46};
        for (int i = 0; i < fontSizes.length; i++) {
            assertEquals(expected[i], page3Arg.getLinesOfText(fontSizes[i]), DELTA, "The number of lines for "+ fontSizes[i]+"pt. font for the 3-arg constructor should be " + expected[i]);
        }
    }   

    @Test
    public void testGetWords3Arg() {
        double[] expected = new double[]{421, 351, 300};
        for (int i = 0; i < fontSizes.length; i++) {
            assertEquals(expected[i], page3Arg.getWordsPerPage(fontSizes[i]), DELTA, "The number of words for "+ fontSizes[i]+"pt. font for the 3-arg constructor should be " + expected[i]);
        }
    }   


    @Test
    public void testGetWidth6Arg() {
        double expected = 8.5;
        assertEquals(expected, page6Arg.getWidth(), DELTA, "The width for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetHeight6Arg() {
        double expected = 11.0;
        assertEquals(expected, page6Arg.getHeight(), DELTA, "The height for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetTopMargin6Arg() {
        double expected = 1.0;
        assertEquals(expected, page6Arg.getTopMargin(), DELTA, "The top margin for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetBottomMargin6Arg() {
        double expected = 1.0;
        assertEquals(expected, page6Arg.getBottomMargin(), DELTA, "The bottom margin for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetLeftMargin6Arg() {
        double expected = 0.75;
        assertEquals(expected, page6Arg.getLeftMargin(), DELTA, "The left margin for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetRightMargin6Arg() {
        double expected = 0.75;
        assertEquals(expected, page6Arg.getRightMargin(), DELTA, "The right margin for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetPrintableArea6Arg() {
        double expected = 63.0;
        assertEquals(expected, page6Arg.getPrintableArea(), DELTA, "The printable area for the 6-arg constructor should be " + expected);
    }

    @Test
    public void testGetLines6Arg() {
        double[] expected = new double[]{64, 54, 46};
        for (int i = 0; i < fontSizes.length; i++) {
            assertEquals(expected[i], page6Arg.getLinesOfText(fontSizes[i]), DELTA, "The number of lines for "+ fontSizes[i]+"pt. font for the 6-arg constructor should be " + expected[i]);
        }
    }   

    @Test
    public void testGetWords6Arg() {
        double[] expected = new double[]{453, 378, 324};
        for (int i = 0; i < fontSizes.length; i++) {
            assertEquals(expected[i], page6Arg.getWordsPerPage(fontSizes[i]), DELTA, "The number of words for "+ fontSizes[i]+"pt. font for the 6-arg constructor should be " + expected[i]);
        }
    }       

    @Test
    public void testSetTopMargin() {
        double expected = 0.75;
        page3Arg.setTopMargin(expected);
        assertEquals(expected, page3Arg.getTopMargin(), DELTA, "The top margin after changing should be " +expected);
    }  

    @Test
    public void testSetBottomMargin() {
        double expected = 0.75;
        page3Arg.setBottomMargin(expected);
        assertEquals(expected, page3Arg.getBottomMargin(), DELTA, "The bottom margin after changing should be " + expected);
    }  

    @Test
    public void testSetLeftMargin() {
        double expected = 0.75;
        page3Arg.setLeftMargin(expected);
        assertEquals(expected, page3Arg.getLeftMargin(), DELTA, "The left margin after changing should be " + expected);
    }  

    @Test
    public void testSetRightMargin() {
        double expected = 0.75;
        page3Arg.setRightMargin(expected);
        assertEquals(expected, page3Arg.getRightMargin(), DELTA, "The right margin after changing should be " + expected);
    }  

    @Test
    public void testSetMarginsPrintableArea() {
        double changeTo = 0.5;
        double expected = 75.0;
        page3Arg.setTopMargin(changeTo);
        page3Arg.setBottomMargin(changeTo);
        page3Arg.setLeftMargin(changeTo);
        page3Arg.setRightMargin(changeTo);

        assertEquals(expected, page3Arg.getPrintableArea(), DELTA, "The printable area after changing should be " + expected);
    }  

    @Test
    public void testSetMarginsLines() {
        double changeTo = 0.5;

        page3Arg.setTopMargin(changeTo);
        page3Arg.setBottomMargin(changeTo);
        page3Arg.setLeftMargin(changeTo);
        page3Arg.setRightMargin(changeTo);

        double[] expected = new double[]{72, 60, 51};
        for (int i = 0; i < fontSizes.length; i++) {
            assertEquals(expected[i], page3Arg.getLinesOfText(fontSizes[i]), DELTA, "The number of lines for "+ fontSizes[i]+"pt. font for the 3-arg constructor after changing should be " + expected[i]);
        }
    } 

    @Test
    public void testSetMarginsWords() {
        double changeTo = 0.5;

        page3Arg.setTopMargin(changeTo);
        page3Arg.setBottomMargin(changeTo);
        page3Arg.setLeftMargin(changeTo);
        page3Arg.setRightMargin(changeTo);

        double[] expected = new double[]{540, 450, 385};
        for (int i = 0; i < fontSizes.length; i++) {
            assertEquals(expected[i], page3Arg.getWordsPerPage(fontSizes[i]), DELTA, "The words for "+ fontSizes[i]+"pt. font for the 3-arg constructor after changing should be " + expected[i]);
        }
    } 
}