public class Wall extends Obstacle {

    public Wall(int distanceObstacle, int heightOstacle) {
        super(distanceObstacle, heightOstacle);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getHeightJump() >= getHeightOstacle();
    }
}
