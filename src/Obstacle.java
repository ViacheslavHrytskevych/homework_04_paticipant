public abstract class Obstacle {

    private int distanceObstacle;
    private int heightOstacle;

    public int getSpeedObstacle() {
        return distanceObstacle;
    }

    public void setSpeedObstacle(int speedObstacle) {
        this.distanceObstacle = speedObstacle;
    }

    public int getHeightOstacle() {
        return heightOstacle;
    }

    public void setHeightOstacle(int heightOstacle) {
        this.heightOstacle = heightOstacle;
    }

    public Obstacle(int speedObstacle, int heightOstacle) {
        this.distanceObstacle = speedObstacle;
        this.heightOstacle = heightOstacle;
    }

    public abstract boolean overcome(Participant participant);

}
