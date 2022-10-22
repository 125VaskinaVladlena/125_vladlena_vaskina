package task;

public enum Direction {
    North ("north"), West("west"), South("south"), East("east");
    private String direct;
    Direction(String direct){
        this.direct = direct;
    }

    public Vector2 move(Vector2 start, double distance) {
        double startX = start.getX();
        double startY = start.getY();

        switch (direct) {
            case "north" -> {
                startY -= distance;
                return new Vector2(startX, startY);
            }
            case "west" -> {
                startX -= distance;
                return new Vector2(startX, startY);
            }
            case "east" -> {
                startX += distance;
                return new Vector2(startX, startY);
            }
            case "south" -> {
                startY += distance;
                return new Vector2(startX, startY);
            }
        }
        return start;
    }
}