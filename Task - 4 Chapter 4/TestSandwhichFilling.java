public class TestSandwhichFilling {
    public static void main(String args[]){
        SandwhichFilling yumSandy = new SandwhichFilling();
        yumSandy.setCaloriesInServing(300);
        yumSandy.setFillingType("Cheese and Bacon");
        System.out.println(yumSandy.getFillingType() + " has " + yumSandy.getCaloriesInServing() + " calories in it" );
    }
}
