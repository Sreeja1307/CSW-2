package newproject;
class UnitConverter {
    public double convert(double value, String unitFrom, String unitTo) {
        if (unitFrom.equals("km") && unitTo.equals("miles")) {
            return value * 0.621371;
        } else if (unitFrom.equals("miles") && unitTo.equals("km")) {
            return value / 0.621371;
        } else if (unitFrom.equals("celsius") && unitTo.equals("fahrenheit")) {
            return (value * 9/5) + 32;
        } else if (unitFrom.equals("fahrenheit") && unitTo.equals("celsius")) {
            return (value - 32) * 5/9; 
        } else {
            throw new IllegalArgumentException("Unsupported conversion between " + unitFrom + " and " + unitTo);
        }
    }
    public int convert(int value, String unitType) {
        if (unitType.equals("hoursToMinutes")) {
            return value * 60; 
        } else if (unitType.equals("daysToSeconds")) {
            return value * 24 * 60 * 60;
        } else {
            throw new IllegalArgumentException("Unsupported conversion for unit: " + unitType);
        }
    }
    public int convert(String time) {
        if (time == null || !time.matches("\\d{2}:\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Invalid time format");
        }
        String[] timePart = time.split(":");
        int hours = Integer.parseInt(timePart[0]);
        int minutes = Integer.parseInt(timePart[1]);
        int seconds = Integer.parseInt(timePart[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}
public class Q10 {
    public static void main(String[] args) {
        UnitConverter uc = new UnitConverter();
        double km = 1000;
        System.out.println(km + " = " + uc.convert(km, "km", "miles") + " miles.");
        double celsius = 16;
        System.out.println(celsius + "°C = " + uc.convert(celsius, "celsius", "fahrenheit") + "°F.");
        int hours = 2;
        System.out.println(hours + " hours = " + uc.convert(hours, "hoursToMinutes") + " minutes.");
        int days = 21;
        System.out.println(days + " days = " + uc.convert(days, "daysToSeconds") + " seconds.");
        String time = "02:30:15";
        System.out.println(time + " = " + uc.convert(time) + " seconds.");
    }
}
