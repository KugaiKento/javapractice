public class Practice01 {
    public static class Robot{
        String name;
        int nenryo;
        public Robot(String name, int nenryo){
            this.name = name;
            this.nenryo = nenryo;
        }
    }
    public static void main(String[] args){
        Robot robot = new Robot("kuso", 0);
        System.out.println(robot.name + robot.nenryo);
    }    
}

