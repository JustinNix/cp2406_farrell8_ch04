public class FormLetterWriter
{
    private String lastName;
    private String firstName;

    public FormLetterWriter()
    {
        lastName = "";
        firstName = "";
    }
    public FormLetterWriter(String enteredLastName, String enteredFirstName)
    {
        lastName = enteredLastName;
        firstName = enteredFirstName;
    }
    public void displaySalutation(String firstName){
        System.out.println("Dear Mr. or Ms. " + firstName + " Thank you for your recent order.");
    }
    public void displaySalutation(String firstName, String lastName){
        System.out.println("Dear Mr. or Ms. " + firstName + " " + lastName + " Thank you for your recent order.");
    }

}
