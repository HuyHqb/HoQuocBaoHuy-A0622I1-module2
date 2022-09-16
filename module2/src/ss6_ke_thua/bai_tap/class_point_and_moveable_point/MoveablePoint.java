package ss6_ke_thua.bai_tap.class_point_and_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    public MoveablePoint move(){
        setXSpeed(getX()+ getXSpeed());
        setYSpeed(getY()+ getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                " speed= " + getXSpeed() +","+ getYSpeed() +
                '}';
    }
}
