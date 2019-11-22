package p9_7;

import shared.Measurable;
import shared.Measurer;

public class MeasurableMeasurer implements Measurer<Measurable>
{
    public double measure(Measurable m)
    {
        return m.getMeasure();
    }
}