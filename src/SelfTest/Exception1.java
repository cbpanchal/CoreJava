package SelfTest;

/**
 * Created by info on 01-Sep-16.
 */
public class Exception1 {
    public static void main(String[] args) {
        try{
            int x=Integer.parseInt("abc");
            System.out.println(x);
        }catch (NumberFormatException e){
            e.printStackTrace();

        }
    }
}
