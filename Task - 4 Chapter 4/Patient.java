/**
 * Created by jc428352 on 18/08/17.
 */

public class Patient {
    private int idNum;
    private int age;
    private BloodData bloodData;

    public Patient(){
        idNum = 0;
        age = 0;
    }

    public Patient(int idNum, int age, char bloodType, char rhFactor){
        this.idNum = idNum;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }

    public void setIdNum(int idNum){
        this.idNum = idNum;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getIdNum(){
        return idNum;
    }

    public int getAge(){
        return age;
    }


}
