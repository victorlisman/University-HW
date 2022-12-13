import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Canvas extends JComponent
{
    private int width;
    private int height;
    private int levels;
    private double positionX;
    private double positionY;
    private double squareSide;

    public Canvas(int width, int height, int levels, int positionX, int positionY, int squareSide)
    {
        this.width = width;
        this.height = height;
        this.levels = levels;
        this.positionX = positionX;
        this.positionY = positionY;
        this.squareSide = squareSide;
    }

//backroundul frumoasei piramizi 
    protected void paintComponent(Graphics graphic)
    {
        Graphics2D graphic2D = (Graphics2D) graphic;
        Rectangle2D.Double backRound = new Rectangle2D.Double(0, 0, width, height);
        graphic2D.setColor(new Color(100, 149, 237));
        graphic2D.fill(backRound);

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphic2D.setRenderingHints(rh);

//incercarea initiala
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < i; j++)
//            {
//                Rectangle2D.Double rect = new Rectangle2D.Double(positionX, positionY, squareSide, squareSide);
//                graphic2D.setColor(new Color(0, 0, 0));
//                graphic2D.fill(rect);
//
//                positionX -= squareSide;
//            }
//
//            positionX = defaultX;
//            positionY += squareSide;
//        }
//
//        positionY = defaultY + n * squareSide;
//        positionX += 4 * squareSide;
//
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < i; j++)
//            {
//                Rectangle2D.Double rect = new Rectangle2D.Double(positionX, positionY, squareSide, squareSide);
//                graphic2D.setColor(new Color(0, 0, 0));
//                graphic2D.fill(rect);
//
//                positionX += squareSide;
//            }
//
//            positionX = defaultX;
//            positionY += squareSide;
//        }

//implementare piramida din kufu(cu mai putine nivele)
        for (int i = 1; i <= levels; i++)
        {
            for (int k = 1; k <= (2 * i - 1); k++)
            {
                Rectangle2D.Double rect = new Rectangle2D.Double(positionX, positionY, squareSide, squareSide);
                graphic2D.setColor(new Color(255, 196, 0));
                graphic2D.fill(rect);

                positionX += squareSide;
            }

            positionX -= (2 * i) * squareSide;
            positionY += squareSide;
        }

        graphic2D.setColor(new Color(46, 29, 0));
        
        Path2D.Double palm1 = new Path2D.Double();
        palm1.moveTo(250, 400);
        palm1.curveTo(350, 200, 300, 200, 250, 200);
        graphic2D.draw(palm1);

        Path2D.Double palm2 = new Path2D.Double();
        palm2.moveTo(300, 400);
        palm2.curveTo(400, 200, 350, 200, 300, 200);
        graphic2D.draw(palm2);

        Line2D.Double top = new Line2D.Double(250, 200, 300, 200);
        graphic2D.draw(top);

        Line2D.Double bot = new Line2D.Double(250, 400, 300, 400);
        graphic2D.draw(bot);

        graphic2D.setColor(Color.GREEN);

        Path2D.Double leaf1 = new Path2D.Double();
        leaf1.moveTo(250, 200);
        leaf1.curveTo(350, 200, 300, 150, 400, 250);
        graphic2D.draw(leaf1);

        Path2D.Double leaf3 = new Path2D.Double();
        leaf3.moveTo(250, 200);
        leaf3.curveTo(300, 200, 100, 250, 100, 250);
        graphic2D.draw(leaf3);

        Path2D.Double leaf2 = new Path2D.Double();
        leaf2.moveTo(250, 200);
        leaf2.curveTo(400, 150, 300, 200, 400, 170);
        graphic2D.draw(leaf2);

    }
}
