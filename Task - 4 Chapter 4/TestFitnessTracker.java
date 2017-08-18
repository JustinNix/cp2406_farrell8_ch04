/**
 * Created by jc428352 on 18/08/17.
 */

public class TestFitnessTracker {
    public static void main(String[] args){
        String activity;
        int numMinutes;
        String date;
        FitnessTracker p1 = new FitnessTracker();
        activity = p1.getActivity();
        numMinutes = p1.getMinutes();
        date = p1.getDate();
        p1.display(activity, numMinutes, date);

    }
}
