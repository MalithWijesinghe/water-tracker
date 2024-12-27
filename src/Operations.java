public class Operations {

    public int calculate(double weight) {
        double calculation = weight * 0.03 * 1000;
        return (int) Math.round(calculation);
    }
}
