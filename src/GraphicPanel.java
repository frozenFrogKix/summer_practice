import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;



/**
 * Created by root on 23.06.17.
 */
public class GraphicPanel extends JPanel{//это рисует
        Graphics2D g2;
        int xStart = -5;
<<<<<<< HEAD
        int xEnd = -5;
        int dis = 5;
=======
        int xEnd =-5;
>>>>>>> 4653db8c67855f3d6bd6c60450fe95564f2cadd3

public void setData(int startX,int endX){
        xStart = startX+10-(startX/19);
        xEnd = endX+10-(endX/19);
        }

    @Override
protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(Color.ORANGE);
<<<<<<< HEAD
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(xStart+dis,5,xEnd+dis,5);
        g2.drawLine(xStart+dis,5,xStart+dis,10);
        g2.drawLine(xEnd+dis,5,xEnd+dis,10);
=======
        xStart += 10;
        xEnd += 10;
        g2.drawLine(xStart,5,xEnd,5);
        g2.drawLine(xStart,5,xStart,10);
        g2.drawLine(xEnd,5,xEnd,10);
>>>>>>> 4653db8c67855f3d6bd6c60450fe95564f2cadd3
        }
};