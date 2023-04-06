public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Person(100, 1),
                new Cat(50, 2),
                new Robot(5, 3),
        };

        Obstacle[] obstacles = {
                new Treadmill(15, 0),
                new Wall(0, 2)
        };

        for (Participant participant : participants) {
            participant.activity(participant);
        }

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean result = obstacle.overcome(participant);
                if (!result) {
                    System.out.println("The " + participant.getClass().getSimpleName() + " lost the " + obstacle.getClass().getSimpleName());
                    break;
                } else {
                    System.out.println("The " + participant.getClass().getSimpleName() + " successfully won the " + obstacle.getClass().getSimpleName());
                }
            }
        }
    }
}


