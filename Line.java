package com.bridgelabz5;


public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public boolean isEqual(Line otherLine) {
        // Check equality of endpoints
        return (startPoint.x == otherLine.startPoint.x && startPoint.y == otherLine.startPoint.y &&
                endPoint.x == otherLine.endPoint.x && endPoint.y == otherLine.endPoint.y) ||
               (startPoint.x == otherLine.endPoint.x && startPoint.y == otherLine.endPoint.y &&
                endPoint.x == otherLine.startPoint.x && endPoint.y == otherLine.startPoint.y);
    }
    public double calculateLength() {
        // Calculate the length of the line using the distance formula
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));
    }

    public int compareLength(Line otherLine) {
        // Calculate the lengths of both lines
        double length1 = this.calculateLength();
        double length2 = otherLine.calculateLength();

        // Compare the lengths
        if (length1 == length2) {
            return 0; // Lines are equal
        } else if (length1 < length2) {
            return -1; // First line is shorter than the second line
        } else {
            return 1; // First line is longer than the second line
        }
    }
    public int compareLengthTo(Line otherLine) {
        double length1 = this.calculateLength();
        double length2 = otherLine.calculateLength();
        return Double.compare(length1, length2);
    }
}


   


