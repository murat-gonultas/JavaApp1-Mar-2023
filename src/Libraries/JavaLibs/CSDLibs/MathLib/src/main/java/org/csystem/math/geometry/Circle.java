/*----------------------------------------------------------------------
	FILE        : Circle.java
	AUTHOR      : JavaApp1-Mar-2023 Group
	LAST UPDATE : 26.09.2023

	Circle class that represents the circle in geometry

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.math.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Circle {
    private static final double DELTA = 0.0001;

    private double m_r;

    public Circle()
    {}

    public Circle(double r)
    {
        setRadius(r);
    }

    public double getRadius()
    {
        return m_r;
    }

    public void setRadius(double r)
    {
        m_r = abs(r);
    }

    public double getArea()
    {
        return PI * m_r * m_r;
    }

    public double getCircumference()
    {
        return 2 * PI * m_r;
    }

    @Override
    public boolean equals(Object other)
    {
        return other instanceof Circle c && Math.abs(m_r - c.m_r) < DELTA;
    }

    @Override
    public String toString()
    {
        return String.format("Radius:%f, Area:%f, Circumference:%f", m_r, getArea(), getCircumference());
    }
}
