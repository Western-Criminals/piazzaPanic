public class Chef {
    private String chefName;
    private boolean busy;

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public void setState(boolean busy) {
        this.busy = busy;
    }

    public String getChefName() {
        return this.chefName;

    public boolean getState() {
        return this.busy;
    }
}
