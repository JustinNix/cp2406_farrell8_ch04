/**
 * Created by jc428352 on 18/08/17.
 */
public class BloodData {
    private char bloodType, rhFactor;

    public BloodData(){
        bloodType = 'O';
        rhFactor = '+';
    }
    public BloodData(char enteredBloodType, char enteredRhFactor){
        bloodType = enteredBloodType;
        rhFactor = enteredRhFactor;
    }
    public void setBloodType(char enteredBloodType){
        bloodType = enteredBloodType;
    }

    public void setRhFactor(char enteredRhFactor){
        rhFactor = enteredRhFactor;
    }

    public char getBloodType(){
        return bloodType;
    }
    public char getRhFactor(){
        return rhFactor;
    }
}
