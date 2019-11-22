package p9_6;

import java.awt.Rectangle;

import shared.DataSet_9_4;

public class RectangleFun
{
    public static void main(String[] args)
    {
        DataSet_9_4<Rectangle> ds = new DataSet_9_4<Rectangle>(new RectanglePerimeterMeasurer());
        
        ds.add(new Rectangle(5, 10, 20, 30));
        ds.add(new Rectangle(5, 10, 30, 30));
        
        System.out.println(ds.getMaximum());
    }
}
