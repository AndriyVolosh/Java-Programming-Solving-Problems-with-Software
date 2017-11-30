import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }
    
    public int getNumPoints (Shape s) {
        // Start with numPoints = 0
        int numPoints = 0;
        // For each point in the shape
        for (Point currPt : s.getPoints()) {
            // Update numPoints
            numPoints++;
        }
        // numPoints is the answer
        return numPoints;
    }
    
    public double getAverageLength (double length, int num) {
        // calculate average length
        double averageLength = length / num;
        // return average length
        return averageLength;
    }
    
    public double getLargestSide (Shape s) {
        // Start with largestSide = 0
        double largestSide = 0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // if statement
            if (largestSide < currDist){
            // Update largestSide by currDist
            largestSide = currDist;
            }
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // largestSide is the answer
        return largestSide;
    }
    
    public double getLargestX (Shape s) {
        // Start with largestSide = 0
        double largestX = 0;
        // For each point currPt in the shape
        for (Point currPt : s.getPoints()) {
            // Find X from currPt 
            double currX = currPt.getX();
            // if statement
            if (largestX < currX){
            // Update largestX by currX
            largestX = currX;
            }
        }
        // largestX is the answer
        return largestX;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        // get number of points in Shape
        int num = getNumPoints(s);
        System.out.println("number of points = " + num);
        // get average length
        double averageLength = getAverageLength (length, num);
        System.out.println("average length = " + averageLength);
        // getLargestSide
        double largestSide = getLargestSide (s);
        System.out.println("largest side = " + largestSide);
        // getLargestX
        double largestX = getLargestX (s);
        System.out.println("largest X = " + largestX);
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
