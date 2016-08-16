package IntializationBlock;

public class Init {
    Init(int x) {
        System.out.println("1st arg const");
    }

    Init() {
        System.out.println("no arg");
    }

    static {
        System.out.println("1st static init");
    }

    {
        System.out.println("1st initialization init");
    }

    {
        System.out.println("2nd Initialixation init");
    }

    static {
        System.out.println("2nd static const");
    }

    static public void main(String []args){
        new Init();
        new Init(36);
    }

}


