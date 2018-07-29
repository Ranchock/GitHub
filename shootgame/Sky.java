class Sky implements FlyingObject {
    private static int speed;
    private static int y1;
    Sky() {
        super();
	speed = 1;
	y1 = -World.HEIGHT;
    }
}
