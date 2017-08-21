public class BreadTest {
    public static void main(String args[]){
        Bread rye = new Bread();
        Bread cafe = new Bread();
        Bread toast = new Bread();
        rye.setBreadType("rye");
        rye.setCaloriesPerSlice(100);
        cafe.setBreadType("cafe");
        toast.setBreadType("Toast");
        toast.setCaloriesPerSlice(5000);
        cafe.setCaloriesPerSlice(200);
        System.out.println(rye.MOTTO() + " " + rye.getBreadType() + " bread has " + rye.getCaloriesPerSlice() + " calories");
        System.out.println(cafe.MOTTO() + " " + cafe.getBreadType() + " bread has " + cafe.getCaloriesPerSlice() + " calories");
        System.out.println(toast.MOTTO() + " " + toast.getBreadType() + " bread has " + toast.getCaloriesPerSlice() + " calories");
    }
}
