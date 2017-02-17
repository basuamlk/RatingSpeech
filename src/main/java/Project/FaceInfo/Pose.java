package Project.FaceInfo;

public class Pose
{
    private Yaw_angle yaw_angle;

    private Roll_angle roll_angle;

    private Pitch_angle pitch_angle;

    public Yaw_angle getYaw_angle ()
    {
        return yaw_angle;
    }

    public void setYaw_angle (Yaw_angle yaw_angle)
    {
        this.yaw_angle = yaw_angle;
    }

    public Roll_angle getRoll_angle ()
    {
        return roll_angle;
    }

    public void setRoll_angle (Roll_angle roll_angle)
    {
        this.roll_angle = roll_angle;
    }

    public Pitch_angle getPitch_angle ()
    {
        return pitch_angle;
    }

    public void setPitch_angle (Pitch_angle pitch_angle)
    {
        this.pitch_angle = pitch_angle;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [yaw_angle = "+yaw_angle+", roll_angle = "+roll_angle+", pitch_angle = "+pitch_angle+"]";
    }
}



