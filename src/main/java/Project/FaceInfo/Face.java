package Project.FaceInfo;

public class Face
{
    private Position position;

    private String tag;

    private String face_id;

    private Attribute attribute;

    public Position getPosition ()
    {
        return position;
    }

    public void setPosition (Position position)
    {
        this.position = position;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public String getFace_id ()
    {
        return face_id;
    }

    public void setFace_id (String face_id)
    {
        this.face_id = face_id;
    }

    public Attribute getAttribute ()
    {
        return attribute;
    }

    public void setAttribute (Attribute attribute)
    {
        this.attribute = attribute;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [position = "+position+", tag = "+tag+", face_id = "+face_id+", attribute = "+attribute+"]";
    }
}
