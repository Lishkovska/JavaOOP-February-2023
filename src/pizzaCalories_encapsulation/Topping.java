package pizzaCalories_encapsulation;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
       setToppingType(toppingType);
       setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        //meat, veggies, cheese, or sauce
        if(toppingType.equals("meat") || toppingType.equals("veggies")
        || toppingType.equals("cheese") || toppingType.equals("sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateCalories(){
        double calculation = 1;

        //Meat – 1.2; · Veggies – 0.8; · Cheese – 1.1; · Sauce – 0.9;

        switch (toppingType){
            case "Meat" :
                calculation = (2 * this.weight) * 1.2;
                break;
            case "Veggies" :
                calculation = (2 * this.weight) * 0.8;
                break;
            case "Cheese" :
                calculation = (2 * this.weight) * 1.1;
                break;
            case "Sauce" :
                calculation = (2 * this.weight) * 0.9;
                break;
        }
        return calculation;

    }
}
