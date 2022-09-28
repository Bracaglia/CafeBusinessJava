import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtils {
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i < 11; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for(int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    public
    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.format("%d --- %s \n", i, menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        Scanner s = new Scanner(System.in); //SCANNER WILL WAIT FOR INPUT FROM A USER
        System.out.println("Please Enter your name:");
        String userName = s.nextLine();
        System.out.format("Hello, %s \n", userName);
        System.out.format("There are %d people in front of you \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}
