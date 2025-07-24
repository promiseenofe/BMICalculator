// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    double pounds;
    double heightInInches;
    double kilos;
    double heightInMeters;


    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        this.pounds = 120;
        this.heightInInches = 72;
        this.kilos = 80;
        this.heightInMeters = 1.85;

    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double pounds, double heightInInches) {
        double imperial = (703 * pounds) / (heightInInches * heightInInches);

        return imperial;

    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double kilos, double heightInMeters) {
        double metric = (kilos / (heightInMeters * heightInMeters));

        return metric;

    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {

        if (bmi < 18.5){
            return "Underweight";

        }else if (bmi < 25){
            return "Normal Weight";
        }else if (bmi < 30){
            return "Overweight";
        }else{
            return "Obese";
        }

    }
}