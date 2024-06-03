//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Car {
    public static void main(String[] args) {
        String signal = "krasniy";
        if (signal.equals("krasniy")) {
            System.out.println("Остановиться");
        } else if (signal.equals("zeleniy")) {
            System.out.println("ехать");
        } else if (signal.equals("yellow")) {
            System.out.println("приготовиться");
        }
    }
}
