package inphosoft.vito.todolist;

import java.util.Date;
import java.util.UUID;

public class ToDo {

    private UUID mID;
    private String mActivity;
    private Date mDate;

    public ToDo() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
            return mID;
        }

    public void setID(UUID ID) {
            mID = ID;
        }

    public String getActivity() {
            return mActivity;
        }

    public void setActivity(String activity) {
            mActivity = activity;
        }

    public Date getDate() {
            return mDate;
        }

    public void setDate(Date date) {
            mDate = date;
        }

}
