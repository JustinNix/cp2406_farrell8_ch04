public class TestSandwhich {
    public static void main(String args[]){
        Sandwhich sandwhich = new Sandwhich();
        sandwhich.setBreadType("Rye");
        sandwhich.setCaloriesPerSlice(100);
        sandwhich.setFillingType("Bacon and Cheese");
        sandwhich.setCaloriesInServering(300);
        System.out.println(sandwhich.getBreadType() + " with " + sandwhich.getFillingType() + " has a total of " + sandwhich.getTotalCalories() + " calories!");
    }
}
