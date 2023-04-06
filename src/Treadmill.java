public class Treadmill extends Obstacle {

    public Treadmill(int distanceObstacle, int heightOstacle) {
        super(distanceObstacle, heightOstacle);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getDistanceRun() >= getSpeedObstacle();
    }
}
