package afterMultithreading;

public class ThreadMain {
    public static void main(String[] args) {

        SampleThreadClass SampleThreadClass = new SampleThreadClass();

        try{
            System.out.println("Part1 program ascending order");
            for(int i=1; i<=10; i++){
                System.out.println("i value is :" + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("exception occured : "  + e.getMessage());

        }
    }


}
