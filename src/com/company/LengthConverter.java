package com.company;

public class LengthConverter {
    public static double mToYd(double m) {
        return m * 1.0936;
    }
    public static double ydToM(double yd) {
        return yd * 0.9144;
    }
    public static double mToFt(double m) {
        return m * 3.2808;
    }
    public static double ftToM(double ft) {
        return ft * 0.3048;
    }
    public static double mToMile(double m) {
        return m * 0.000621371;
    }
    public static double mileToM(double mile) {
        return mile * 1609.34;
    }
}
