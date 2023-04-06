public abstract class Participant {

    private int distanceRun;
    private int heightJump;

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(int heightJump) {
        this.heightJump = heightJump;
    }

    public Participant(int speedRun, int heightJump) {
        this.distanceRun = speedRun;
        this.heightJump = heightJump;
    }

    public void activity(Participant participant) {
        System.out.println("The " + getClass().getSimpleName() + " is running and jumping");
    }

}
