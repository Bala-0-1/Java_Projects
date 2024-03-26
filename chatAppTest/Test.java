package chatAppTest;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.add(1,2,3,4,5));
    }

    public int add(int... a){
        int sum = 0;
        for(int i: a){
            sum+=i;
        }
        System.out.println(a.getClass().getName());
        return sum;
    }


}
