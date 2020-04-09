package com.Teo;

import java.util.Arrays;

public class Count {

    /**
     * Determines the number of rectangles found in the given points
     * LD, LU, RD, RU - Left Down, Left Up, Down Right, Down Up
     * @param Locations
     * @return
     */

    public int getRectangles(int [][]Locations) {

        final Point []points = new Point[Locations.length];

        for(int i = 0; i < Locations.length; i++) {
            points[i] = new Point(Locations[i][0], Locations[i][1]);
        }

        Arrays.sort(points);

        int rectangleCount = 0;
        for(int i = 0; i < points.length; i++) {
            Point LD = points[i];

            for(int j = i+1; j < points.length; j++) {
                Point LU = points[j];

                if(LD.getX() == LU.getX()) {

                    for(int k = j+1; k < points.length; k++) {
                        Point RD = points[k];

                        if(LD.getY() == RD.getY()){
                            Point RU = new Point(RD.getX(), LU.getY());

                            if(RU.existsIn(points))
                                rectangleCount++;
                        }
                    }
                }
            }
        }
        return rectangleCount;
    }
}
