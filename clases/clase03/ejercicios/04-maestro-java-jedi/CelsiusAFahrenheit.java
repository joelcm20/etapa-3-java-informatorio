public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        // formula: Fahrenheit = Celsius*9/5+32
        float celsius = 20;
        float fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%sºC = %sºF", celsius, fahrenheit);
    }
}