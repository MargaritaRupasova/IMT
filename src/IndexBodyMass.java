public class IndexBodyMass {

    public double imt(double weight, double height) {
        double heightInMetre = height / 100;
        double result = weight / (heightInMetre * heightInMetre);

        return result;
    }
}
