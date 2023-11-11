package Class;

public class SeasonDetector {
    private int month;

    public SeasonDetector(int month){
        this.month = month;
    }

    public void month(){
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month < 6) {
                System.out.println("春");
            } else if (month >= 6 && month <= 8) {
                System.out.println("夏");
            } else if (month >= 9 && month <= 11) {
                System.out.println("秋");
            } else {
                System.out.println("冬");
            }
        } else {
            System.out.println("月の値は1から12の間でなければなりません。");
        }
    }

    public void month2(){

    }
}
