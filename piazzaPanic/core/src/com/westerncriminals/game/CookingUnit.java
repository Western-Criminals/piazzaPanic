public class CookingUnit {
    private String dish;
    private boolean occupied;

    public void setDish(Dish dish) {
        this.dish = dish.getDishName();
        this.occupied = true;
    }

    public void removeDish() {
        this.occupied = false;
    }

    public String getDish() {
        if (this.occupied == false) {
            return "This slot is empty.";
        } else {
            return this.dish;
        }
    }
}
