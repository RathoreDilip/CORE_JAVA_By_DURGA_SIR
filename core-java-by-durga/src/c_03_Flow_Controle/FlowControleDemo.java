package c_03_Flow_Controle;

public class FlowControleDemo {
    public static void main(String[] args) {

        // Default in switch
        int x=2;
        switch (x){
            default:
                System.out.println("default");
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }
}
