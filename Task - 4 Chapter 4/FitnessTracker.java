/**
 * Created by jc428352 on 18/08/17.
 */
import java.util.Calendar;
import java.util.Date;
public class FitnessTracker {
    private String activity;
    private int numMinutes;
    private String date;

    public FitnessTracker(){
        activity="running";
        numMinutes = 1;
        date = "1/1/1";
    }

    public FitnessTracker(String activity, int numMinutes, String date){
        this.activity = activity;
        this.numMinutes = numMinutes;
        this.date = date;
    }

    public int getNumMinutes() {
        return numMinutes;
    }

    public String getActivity() {
        return activity;
    }

    public String getDate() {
        return date;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumMinutes(int numMinutes) {
        this.numMinutes = numMinutes;
    }

    public void display(String activity, int numMinutes, String date){
        System.out.println(activity + " " + numMinutes + " " + date);
    }
}
