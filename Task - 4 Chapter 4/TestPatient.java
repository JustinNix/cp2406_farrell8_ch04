/**
 * Created by jc428352 on 18/08/17.
 */
public class TestPatient {
    public static void main(String args[]) {
        int idNum = 0, age = 1;
        char bloodType = 'O', rhFactor = '+';
        Patient p1 = new Patient(idNum, age, bloodType, rhFactor);
        p1.getBloodData();
        //p1.setBloodData("A", '-');
        p1.setIdNum(1230123);
        p1.setAge(20);
        idNum = p1.getIdNum();
        age = p1.getAge();
        System.out.println(idNum + " " + age + " " + bloodType + " " + rhFactor);
    }
}
