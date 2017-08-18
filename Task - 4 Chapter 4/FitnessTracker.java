/**
 * Created by jc428352 on 18/08/17.
 */
import java.util.Scanner;
public class FitnessTracker {
    private String activity;
    private int numMinutes;
    private String date;

    public FitnessTracker(){
        activity="running";
        numMinutes = 1;
        date = "1/1/2017";
    }

    public FitnessTracker(String enteredActivity, int enteredNumMinutes, String enteredDate){
        activity = enteredActivity;
        numMinutes = enteredNumMinutes;
        date = enteredDate;
    }

    public String getActivity(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public int getMinutes(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public String getDate(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void display(String activity, int numMinutes, String date){
        System.out.println(activity + " " + numMinutes + " " + date);
    }
}
