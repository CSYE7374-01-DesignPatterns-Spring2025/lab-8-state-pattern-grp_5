public class BreakfastState implements MenuState {
    @Override
    public void showMenu() {
        System.out.println("Breakfast Menu:");
        System.out.println("1 - Cereal    - $0.99");
        System.out.println("2 - Pancakes  - $1.99");
        System.out.println("3 - Oatmeal   - $2.99");
    }

}
