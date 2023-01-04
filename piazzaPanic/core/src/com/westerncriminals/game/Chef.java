public class Chef {
    private String chefName;
    private boolean busy;

    public void setState(boolean busy) {
        this.busy = busy;
    }

    public boolean getState() {
        return this.busy;
    }
}
