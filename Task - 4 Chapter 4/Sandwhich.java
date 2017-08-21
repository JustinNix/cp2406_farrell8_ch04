public class Sandwhich {
    private String breadType;
    private String fillingType;
    private int caloriesPerSlice;
    private int caloriesInServering;
    public Sandwhich(){
        breadType="";
        fillingType="";
        caloriesInServering=0;
        caloriesPerSlice=0;
    }
    public Sandwhich(String breadType, String fillingType, int caloriesPerSlice, int caloriesInServering){
        this.breadType=breadType;
        this.fillingType=fillingType;
        this.caloriesPerSlice=caloriesPerSlice;
        this.caloriesInServering=caloriesInServering;
    }

    public void setFillingType(String fillingType) {
        this.fillingType = fillingType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setCaloriesPerSlice(int caloriesPerSlice) {
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public void setCaloriesInServering(int caloriesInServering) {
        this.caloriesInServering = caloriesInServering;
    }

    public String getFillingType() {
        return fillingType;
    }

    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getCaloriesInServering() {
        return caloriesInServering;
    }
    public int getTotalCalories(){
        int totalCalories = caloriesPerSlice * 2 + caloriesInServering;
        return totalCalories;
    }
}
