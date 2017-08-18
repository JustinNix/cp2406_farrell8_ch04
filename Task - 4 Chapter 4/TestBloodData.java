/**
 * Created by jc428352 on 18/08/17.
 */
public class TestBloodData {
    public static void main(String[] args){
        char bloodType = 'O', rhFactor = '+';
        BloodData p1 = new BloodData(bloodType, rhFactor);
        bloodType = p1.getBloodType();
        rhFactor = p1.getRhFactor();
        System.out.println(bloodType + " " + rhFactor);
        p1.setBloodType('A');
        p1.setRhFactor('-');
        bloodType = p1.getBloodType();
        rhFactor = p1.getRhFactor();
        System.out.println(bloodType + " " + rhFactor);
    }
}
