package Class;

public class AbsoluteValueCalculator {
    private int value;
    private int result;
    public AbsoluteValueCalculator(int value){
        this.value = value;
        caluclateResult();
    }

    public void caluclateResult(){
        result = (value < 0) ? -value : value;
    }

    public int getresult(){
        return result;
    }
}
