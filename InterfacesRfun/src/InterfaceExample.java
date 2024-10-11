
interface WaterBottleInterface {

    String color = "Blue";
    void pourOut();
    void fillUp();

}
public class InterfaceExample implements WaterBottleInterface{
    public static void main(String[]args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.pourOut();
    }

    @Override
    public void pourOut() {
        System.out.println("Water is empty");
    }

    @Override
    public void fillUp() {
        System.out.println("Water is filled");
    }
}
