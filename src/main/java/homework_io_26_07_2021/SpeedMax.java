package homework_io_26_07_2021;

public class SpeedMax {
    private String unit;
    private int value;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SpeedMax{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}
