# CSC 1060 - Practice 1
In this practice, you will write an original class that represents a page of text. You will also write a PageRunner class that create Page objects with different data to demonstrate that the methods in your page object work.

## Overview
A page consists of its width and height as well as top, bottom, left, and right margins. Margins are the space from the edge of the pages in which text cannot be printed. The units are assumed to be in inches.

To compute the printable area, first substract the left and right margins from the width and the top and bottom margins from the height. Then, multiply the adjusted width and height to obtain the printable area.

To compute the estimated number of lines of text that can fit on a page given a font size, assume that one line of 72-point text fits per inch of height. You can then use the following formula to compute the number of lines of text the page holds. $$\lfloor\frac{72.0}{{fontsize}} * height\rfloor$$. When you translate this to Java, carry out all the computations as doubles, and then you can use the `(int)` cast to find the floor.

To compute the estimated the number of words that can fit on a page given a font size, assume that one square inch of printable area can hold one 72-point word. You can then use the following formula to compute the number of lines of text the page holds. $$\lfloor\frac{72.0}{{fontsize}} * area\rfloor$$. When you translate this to Java, carry out all the computations as doubles, and then you can use the `(int)` cast to find the floor.


## Task
1. Write the class, including all instance variables, constructors, and methods. The example data shows all of the constructors and methods in use.
2. Generate JavaDoc documentation for the class. It should be stored in a folder called `docs`. To generate JavaDoc documentation, run the command `javadoc -d docs src/main/java/Page.java`.

## Example Data
| Code Statement | Effect / Return|
| :--- | :---  |
|`Page p = new Page(8.5, 11.0, 1.0);` | Creates a page that is 8.5 inches wide, 11 inches high with all margins set to 1.0. |
| `p.getPrintableArea()`; | 58.5 |
| `p.getLinesOfText(10);` | 64 |
| `p.getLinesOfText(12);` | 54 |
| `p.getLinesOfText(14);` | 46 |
| `p.getWordsPerPage(10);` | 421 |
| `p.getWordsPerPage(12);` | 351 |
| `p.getWordsPerPage(14);` | 300 |
| `p = new Page(8.5, 11.0, 1.0, 0.5, 0.75, 0.25);` | Creates a page that is 8.5 inches wide, 11 inches high with various margins. |
| `p.getTopMargin();` | 1.0 |
| `p.getBottomMargin();` | 0.5 |
| `p.getLeftMargin();` | 0.75 |
| `p.getRightMargin();` | 0.25 |
| `p.setBottomMargin(1.0);` | Sets the bottom margin to 1.0. |
| `p.setLeftMargin(1.0);` | Sets the left margin to 1.0. |
| `p.setRightMargin(1.0);` | Sets the right margin to 1.0. |
 `p.getTopMargin();` | 1.0 |
| `p.getBottomMargin();` | 1.0 |
| `p.getLeftMargin();` | 1.0 |
| `p.getRightMargin();` | 1.0 |
