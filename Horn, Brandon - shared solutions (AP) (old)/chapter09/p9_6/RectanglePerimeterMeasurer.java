package p9_6;

import java.awt.Rectangle;

import shared.Measurer;

public class RectanglePerimeterMeasurer implements Measurer<Rectangle>
{
    public double measure(Rectangle rect)
    {
        return (rect.getHeight() + rect.getWidth()) * 2;
    }
}