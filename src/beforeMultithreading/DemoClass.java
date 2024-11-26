package beforeMultithreading;

public class DemoClass {
    public static void main(String[] args) {

        System.out.println("Part1 program ascending order");
        for(int i=1; i<=10; i++){
            System.out.println("i value is :" + i);

        }
        System.out.println("Part2 program decensding order");
        for(int j=10; j>=1; j--){
            System.out.println("i value is :" + j);

        }
    }
}
