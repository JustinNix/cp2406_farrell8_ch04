/**
 * Created by jc428352 on 18/08/17.
 */
public class FormLetterWriterMain {
    public static void main(String[] args){
        String lastName = "Bro";
        String firstName = "Dave";
        FormLetterWriter p1 = new FormLetterWriter(firstName, lastName);
        FormLetterWriter p2 = new FormLetterWriter(firstName, lastName);
        p1.displaySalutation(firstName);
        p2.displaySalutation(firstName, lastName);
    }
}
