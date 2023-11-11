package Class;

public class ValueComparator {
    private int value1;
    private int value2;
    public ValueComparator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
       
    }

    public void Comparator(){
        if(value1 > value2){
            System.out.println("１つ目のデータの方が大きいです");
        }else{
            System.out.println("２つ目のデータの方が大きいです");
        }
    }
}
