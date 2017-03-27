import java.util.*;

public class Observation{

    private int readings;
    ArrayList <T> observations;
    Sensor sensor;

    public Observation(Sensor sensor, int readings){
        this.sensor = sensor;
        this.readings = readings;
        observations = new ArrayList<sensor.readData().getClass()>(readings);
    }


    public int getReadings() {
        return readings;
    }

    public void setReadings(int readings) {
        this.readings = readings;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public void update(){
        //atualiza observations
    }

    public java.lang.String toString() {
        String str = "Observation{" +
                     "readings=" + readings ;

        for(int aux = 1; aux <= readings; aux++){
            str +=(", observations"+aux+"="+observations[aux]+"\n");
        }
        ", sensor=" + sensor +
                '}';
        return str;

    }
}