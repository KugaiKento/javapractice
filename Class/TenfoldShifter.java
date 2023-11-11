package Class;

public class TenfoldShifter {
    private int value;
    private int result;

    public TenfoldShifter(int value){
       this.value = value;
       caluclateResult();
    }

    private void caluclateResult() {
        result = (value << 3) + (value << 1);
    }


    public int getResult() {
        return result;
    }

}
