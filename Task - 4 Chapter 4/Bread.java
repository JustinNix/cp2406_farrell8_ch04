public class Bread {
    private String breadType;
    private int caloriesPerSlice;

    public Bread(){
        breadType = "";
        caloriesPerSlice = 0;
    }
    public Bread(String breadType, int caloriesPerSlice){
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
    public String getBreadType() {
        return breadType;
    }
    public void setCaloriesPerSlice(int caloriesPerSlice) {
        this.caloriesPerSlice = caloriesPerSlice;
    }
    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }
    public final static String MOTTO(){
        return "The staff of life - ";
    }
}
