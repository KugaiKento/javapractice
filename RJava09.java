public class RJava09 {

    public static double getAvg(int[] d) {
        int sum = 0;
        for (int v : d){
            sum += v;
        }

        return (double) sum / d.length;
    }

    public static void main(String[] args){
        int[] data = {10,20,30,40,50,60,};
        double avg;
        avg = getAvg(data);
        System.out.printf("平均は%.2fです\n", avg);
    }


}
