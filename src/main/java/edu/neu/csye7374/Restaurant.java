class Restaurant {
    private MenuState currentState;

    public Restaurant() {
        // Default state
        this.currentState = new BreakfastState();
    }

    public void setState(MenuState state) {
        this.currentState = state;
    }

    public void showMenu() {
        currentState.showMenu();
    }
}