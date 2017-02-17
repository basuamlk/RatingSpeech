package Project.FaceInfo;

public class Gender
{
    private String value;

    private String confidence;

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getConfidence ()
    {
        return confidence;
    }

    public void setConfidence (String confidence)
    {
        this.confidence = confidence;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+", confidence = "+confidence+"]";
    }


    public class Smiling
    {
        private String value;

        public String getValue ()
        {
            return value;
        }

        public void setValue (String value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [value = "+value+"]";
        }
    }


}


