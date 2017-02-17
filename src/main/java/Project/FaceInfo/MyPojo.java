package Project.FaceInfo;

import Project.FaceInfo.Face;

/**
 * Created by yassin on 2/17/17.
 */
public class MyPojo {

        private Face[] face;

        private String session_id;

        private String img_id;

        private String img_height;

        private String img_width;

        private String url;

        public Face[] getFace ()
        {
            return face;
        }

        public void setFace (Face[] face)
        {
            this.face = face;
        }

        public String getSession_id ()
        {
            return session_id;
        }

        public void setSession_id (String session_id)
        {
            this.session_id = session_id;
        }

        public String getImg_id ()
        {
            return img_id;
        }

        public void setImg_id (String img_id)
        {
            this.img_id = img_id;
        }

        public String getImg_height ()
        {
            return img_height;
        }

        public void setImg_height (String img_height)
        {
            this.img_height = img_height;
        }

        public String getImg_width ()
        {
            return img_width;
        }

        public void setImg_width (String img_width)
        {
            this.img_width = img_width;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [face = "+face+", session_id = "+session_id+", img_id = "+img_id+", img_height = "+img_height+", img_width = "+img_width+", url = "+url+"]";
        }
}


