class DinnerState implements MenuState {
    @Override
    public void showMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("1 - Soup     - $11.99");
        System.out.println("2 - Salad    - $12.99");
        System.out.println("3 - Steak    - $13.99");
        System.out.println("4 - Salmon   - $14.99");
        System.out.println("5 - Chicken  - $15.99");
    }
}