package homework_io_26_07_2021;

public class Engine {
    private String unit;
    private double volume;
    private int rpm;
    private String compressionRatio;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(String compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "unit='" + unit + '\'' +
                ", volume=" + volume +
                ", rpm=" + rpm +
                ", compressionRatio='" + compressionRatio + '\'' +
                '}';
    }
}
