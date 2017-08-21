public class SandwhichFilling {
    private String fillingType;
    private int caloriesInServing;
    public SandwhichFilling(){
        fillingType="";
        caloriesInServing = 0;
    }
    public SandwhichFilling(String fillingType, int caloriesInServing){
        this.fillingType = fillingType;
        this.caloriesInServing = caloriesInServing;
    }

    public void setFillingType(String fillingType) {
        this.fillingType = fillingType;
    }

    public void setCaloriesInServing(int caloriesInServing) {
        this.caloriesInServing = caloriesInServing;
    }

    public int getCaloriesInServing() {
        return caloriesInServing;
    }

    public String getFillingType() {
        return fillingType;
    }
}
