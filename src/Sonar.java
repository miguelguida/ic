import java.util.ArrayList;

public class Sonar extends RangeSensor {

    private ArrayList <double> data;
    private int nSensors;

    public Sonar(double coordX, double coordY, double coordZ, double minDistance, double maxDistance, double height, double beamAngle, double centerAngle,int nSensors){
        super(coordX, coordY, coordZ, minDistance, maxDistance, height, beamAngle, centerAngle);
        this.nSensors = nSensors;
        data = new ArrayList<Double>(nSensors);
    }

    public int getnSensors() {
        return nSensors;
    }

    public void setnSensors(int nSensors) {
        this.nSensors = nSensors;
    }

    public ArrayList<double> getData() {
        return data;
    }

    public void setData(ArrayList<double> data) {
        this.data = data;
    }
    
   
    public void readData(ArrayList<double> data){
        this.data = data;
    } 

    public String toString() {
        return "Sonar{" +
                super.toString() +
                ", data=" + data +
                ", nSensors=" + nSensors +
                '}';
    }
}
