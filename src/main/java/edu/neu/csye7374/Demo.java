package edu.neu.csye7374;

package edu.neu.csye7374;

public class Demo {
    public static void DemoRun() {
        Restaurant restaurant = new Restaurant();
 
        System.out.println("Current State: Breakfast...");
        restaurant.showMenu();
 
        System.out.println("\nSwitching to Lunch...");
        restaurant.setState(new LunchState());
        restaurant.showMenu();
 
        System.out.println("\nSwitching to Dinner...");
        restaurant.setState(new DinnerState());
        restaurant.showMenu();
 
        System.out.println("\nSwitching to ClosedState...");
        restaurant.setState(new ClosedState());
        restaurant.showMenu();
 
    }
}
 