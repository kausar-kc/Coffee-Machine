/*public class Main {

    public static void main(String[] args) {
        // Robot starting position and direction
        Robot robot = new Robot(1, 1, Direction.RIGHT);

        // Target position
        Move.moveRobot(robot, 0, -1);

        // Robot new position after executing move function
        System.out.println(robot.getX() + " " + robot.getY());
    }
}*/

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {

        int x = robot.getX();
        int y = robot.getY();
        int dX = toX - x;
        int dY = toY - y;
        do {
            robot.turnRight();
        } while (robot.getDirection() != Direction.UP);
        if (dY >= 0) {
            for (int i = 0; i < dY; i++) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            robot.turnRight();
            dY = -dY;
            for (int i = 0; i < dY; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            robot.turnRight();
        }
        robot.turnRight();
        if (dX >= 0) {
            for (int i = 0; i < dX; i++) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            robot.turnRight();
            dX = -dX;
            for (int i = 0; i < dX; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            robot.turnRight();
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}