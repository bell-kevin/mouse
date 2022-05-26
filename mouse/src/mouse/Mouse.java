package mouse;

public class Mouse {

    private int age = 0; //age of mouse in days
    private double weight = 1.0; //mouse weight in grams
    private double percentageGrowthRate; //increase per day
    //****************************************************
    //This method assigns the mouse's percent growth rate

    public void setPercentageGrowthRate(double percentGrowthRate) {
        this.percentageGrowthRate = percentGrowthRate;
    } // end setPercentGrowthRate
//**********************************************************
//This method simulates one day of growth for the mouse. 

    public void grow() {
        this.weight += (.01 * this.percentageGrowthRate * this.weight);
        this.age++;
    } //end grow
//***************************************************************
//This method prints the mouse's age and weight.

    public void display() {
        System.out.printf("Age = %d, weight = %.3f\n", this.age, this.weight);
    } //end display
} //end class mouse
