package com.Teo;

public class Point implements Comparable<Point>{

    /**
     * Represents the X and Y coordinates
     */

    private int X;
    private int Y;

    /**
     * Represents the constructor of the class
     * @param X
     * @param Y
     */

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     * Represents the getters of the X and Y coordinates
     * @return
     */

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    /**
     * Checks if a point exists in the matrix
     * @param graph
     * @return
     */

    public boolean existsIn(Point[] graph) {
        return Array.contains(graph, this);
    }

    /**
     * Overrding the toString command so we can have both axes
     * @return
     */
    @Override
    public String toString() {
        return "Point{" + "X=" + X + ", Y=" + Y + '}';
    }

    /**
     * Compares the points based firstly on X axes and then on Y
     * @param p
     * @return
     */

    @Override
    public int compareTo(Point p) {
        if(Integer.compare(this.getX(),p.getX()) == 0)
        {
            return Integer.compare(this.getY(), p.getY());
        }

        return Integer.compare(this.getX(),p.getX());
    }

}