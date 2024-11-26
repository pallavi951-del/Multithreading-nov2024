package afterMultithreading;

public class SampleThreadClass extends Thread{

    SampleThreadClass(){
        start();
    }

    @Override
    public void run() {
       try{
           System.out.println("Part2 program decensding order");
           for(int j=10; j>=1; j--){
               System.out.println("j value is :" + j);
               Thread.sleep(500);
           }


           }catch (Exception e){
           System.out.println("excception occured :" + e.getMessage());

       }
    }
}
