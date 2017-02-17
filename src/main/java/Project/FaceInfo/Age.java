package Project.FaceInfo;

public class Age
{
    private String range;

    private String value;

    public String getRange ()
    {
        return range;
    }

    public void setRange (String range)
    {
        this.range = range;
    }

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
        return "ClassPojo [range = "+range+", value = "+value+"]";
    }
}
