package pizzaCalories_encapsulation;

public class Dough {
  private String flourType;
  private String bakingTechnique;
  private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        //"Invalid type of dough.
        //e white or wholegrain and in addition, it can be crispy, chewy, or homemade.
        if (flourType.equals("White") || flourType.equals("Wholegrain")){
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy")
        || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateCalories(){
        double calculateCalories = 1;

        switch (flourType){
            case "White" :
                if (bakingTechnique.equals("Crispy")){
                    calculateCalories = (2 * this.weight) * 1.5 * 0.9;
                } else if(bakingTechnique.equals("Chewy")){
                    calculateCalories = (2 * this.weight) * 1.5 * 1.1;
                } else if (bakingTechnique.equals("Homemade")){
                    calculateCalories = (2 * this.weight) * 1.5 * 1.0;
                }
                break;
            case "Wholegrain":
                if (bakingTechnique.equals("Crispy")){
                    calculateCalories = (2 * this.weight) * 1.0 * 0.9;
                } else if(bakingTechnique.equals("Chewy")){
                    calculateCalories = (2 * this.weight) * 1.0 * 1.1;
                } else if (bakingTechnique.equals("Homemade")){
                    calculateCalories = (2 * this.weight) * 1.0 * 1.0;
                }
                break;
        }

        return calculateCalories;
    }
}
