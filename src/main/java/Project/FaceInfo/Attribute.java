package Project.FaceInfo;

public class Attribute
{
    private Pose pose;

    private Age age;

    private Glass glass;

    private Gender gender;

    private Race race;

    private Smiling smiling;

    public Pose getPose ()
    {
        return pose;
    }

    public void setPose (Pose pose)
    {
        this.pose = pose;
    }

    public Age getAge ()
    {
        return age;
    }

    public void setAge (Age age)
    {
        this.age = age;
    }

    public Glass getGlass ()
    {
        return glass;
    }

    public void setGlass (Glass glass)
    {
        this.glass = glass;
    }

    public Gender getGender ()
    {
        return gender;
    }

    public void setGender (Gender gender)
    {
        this.gender = gender;
    }

    public Race getRace ()
    {
        return race;
    }

    public void setRace (Race race)
    {
        this.race = race;
    }

    public Smiling getSmiling ()
    {
        return smiling;
    }

    public void setSmiling (Smiling smiling)
    {
        this.smiling = smiling;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pose = "+pose+", age = "+age+", glass = "+glass+", gender = "+gender+", race = "+race+", smiling = "+smiling+"]";
    }

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
}
