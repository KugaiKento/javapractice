package Class;

public class DivisibilityChecker {
    private int value1;
    private int value2;
    private double result;
    public DivisibilityChecker(int value1,int value2){
        this.value1 = value1;
        this.value2 = value2;
        Check();
    }

    public void Check(){
        result = (double) value1 % value2;
    }

    public double result(){
        return result;
    }
}
