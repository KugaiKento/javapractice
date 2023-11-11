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

    public String month2(){
        switch (month) {
            case 3:
            case 4:
            case 5:
                return "春";
            case 6:
            case 7:
            case 8:
                return "夏";
            case 9:
            case 10:
            case 11:
                return "秋";
            case 12:
            case 1:
            case 2:
                return "冬";
        
            default:
                return "無効";
        }
    }
}
