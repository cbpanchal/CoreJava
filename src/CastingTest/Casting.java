package CastingTest;


public class Casting {
    static  public void main(String args[]){
        float f=32.3f;
        byte b= (byte) 128;
        System.out.println("byte is ="+b);
        long l=130L;
        byte d=(byte)l;
        System.out.println("Byte value is: "+d);
        int a=10;
        System.out.println(a);
        int ba=a;
        ba=20;
        System.out.println("");
        Long x=new Long(42);
        Short y=new Short("57");

    }
}
