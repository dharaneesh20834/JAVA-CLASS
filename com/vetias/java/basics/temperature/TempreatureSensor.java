
public class TemperatureSensor implements Sensor {
    private float temperature;
    public TemperatureSensor(float aTemperature){
        temperature=aTemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }

}
  