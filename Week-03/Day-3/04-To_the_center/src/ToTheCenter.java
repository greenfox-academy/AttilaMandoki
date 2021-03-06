import javax.swing.*;

        import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.




    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter first coordinate:");
    int userInput1 = scanner.nextInt();
    System.out.println("Please enter second coordinate:");
    int userInput2 = scanner.nextInt();

    int starterX = userInput1;
    int starterY = userInput2;

    int centreX = WIDTH / 2;
    int centreY = HEIGHT / 2;

    graphics.drawLine(starterX, starterY, centreX, centreY);

  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}