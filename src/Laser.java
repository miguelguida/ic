import java.util.ArrayList;

public class Laser extends RangeSensor{

    private ArrayList <double> data;
    private int numreadings;
    private double resolution;
    private double interval;

    public Laser(double coordX, double coordY, double coordZ, double minDistance, double maxDistance, double height, double beamAngle, double centerAngle, int numreadings, double resolution, double interval) {
        super(coordX, coordY, coordZ, minDistance, maxDistance, height, beamAngle, centerAngle);
        this.numreadings = numreadings;
        this.resolution = resolution;
        this.interval = interval;
        data = new ArrayList<double>(numreadings);
    }

    public ArrayList<double> readData(ArrayList data){

        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public int getNumreadings() {
        return numreadings;
    }

    public void setNumreadings(int numreadings) {
        this.numreadings = numreadings;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public double getInterval() {
        return interval;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }

    public String toString() {
        return  "Laser{" +
                super.toString() +
                ", data=" + data +
                ", numreadings=" + numreadings +
                ", resolution=" + resolution +
                ", interval=" + interval +
                '}';
    }
}
