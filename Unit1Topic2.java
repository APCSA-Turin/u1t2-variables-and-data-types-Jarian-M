/* Programmer: Jarian Martinez
 * Description: The program describes the physical characteristics of Jarian and Christopher, such as their height and weight.
 * The program also converts Jarian's weight from pounds to kilograms in order to match the units of Christopher's weight.
 * In addition, the program determines the difference of the heights of Jarian and Christopher and tells the user who is taller and by how much in inches.
 * Moreover, the program tells the user the ages of both Jarian and Christopher as well as whether or not they can get their learner permit in New York.
 * Lastly, the program also updates Christopher's age as well as states whether or not he can get his learner permit after turning 16.
 */
public class Unit1Topic2 {
    public static void main (String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2; //1 kg is approximately 2.2 lbs
        String firstName1 = "Jarian";
        String lastName1 = "Martinez";
        String firstName2;
        firstName2 = "Christopher";
        String lastName2 = "Smith";
        int height1 = 72; //Jarian's height in inches
        double height2 = 68.5; //Christopher's height in inches
        double differenceInHeight = (height1 - height2); //The difference in height between Jarian and Christopher
        int weight1 = 170; //Jarian's weight in pounds
        double weight2 = 68.0389; //Christopher's weight in kilograms
        int age1;
        age1 = 16;
        int age2 = 15;
        boolean learnerPermit1;
        boolean learnerPermit2 = false;
        if (age1 < 16) {
            learnerPermit1 = false; // In New York, you cant get your learner permit if you are under the age of 16
        } else {
            learnerPermit1 = true; // In New York, you can get your learner permit if you are 16 years old or older.
        }
        System.out.println (firstName1 + " " + lastName1 + " is " + height1 + " inches tall.");
        System.out.println (firstName2 + " " + lastName2 + " is " + height2 + " inches tall.");
        System.out.println (firstName1 + " is " + differenceInHeight + " inches taller than Christopher.");
        double weightInKgs1 = (weight1/POUNDS_PER_KILOGRAM);
        System.out.println (firstName1 + " weighs " + weight1 + " pounds.");
        System.out.println ("There are " + POUNDS_PER_KILOGRAM + " pounds in one kilogram.");
        System.out.println ("This means that " + firstName1 + " weighs " + weightInKgs1 + " kilograms.");
        System.out.println (firstName2 + " weighs " + weight2 + " kilograms.");
        System.out.println (firstName1 + " is " + age1 + " years old.");
        System.out.println (firstName2 + " is " + age2 + " years old.");
        System.out.println ("True or false? In New York, " + firstName1 + " can get his learner permit: " + learnerPermit1);
        System.out.println ("True or false? In New York, " + firstName2 + " can get his learner permit: " + learnerPermit2);
        age2 = 16;
        if (age2 < 16) {
            learnerPermit2 = false;
        } else {
            learnerPermit2 = true;
        }
        System.out.println ("It's " + firstName2 + "'s birthday today! He is now " + age2 + " years old. True or false? He can now get his learner permit: " + learnerPermit2);
    }
}