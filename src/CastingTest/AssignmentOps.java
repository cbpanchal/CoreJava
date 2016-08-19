package CastingTest;

/**
 * Created by info on 19-Aug-16.
 */
public class AssignmentOps {
    public static void main(String[] args) {
        int sizeYOfYard = 10;
        int numOfPets = 3;

        String status = (numOfPets < 4) ? "pet count ok ..!1" : (sizeYOfYard > 8) ? "pet limit on the edge" : "too many pets";

        System.out.println("pet status is :" + status);
    }

}
