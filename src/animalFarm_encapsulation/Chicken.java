package animalFarm_encapsulation;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
       setName(name);
       setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.length() >= 1){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age <= 15 && age >= 0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    public double productPerDay(){
       return this.calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        double eggs = 0;
        if(this.age >= 0 && this.age <= 5){
            eggs = 2;
        } else if (this.age >= 6 && this.age <= 11){
            eggs = 1;
        } else {
            eggs = 0.75;
        }
        return eggs;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",name,age,productPerDay());
    }
}
