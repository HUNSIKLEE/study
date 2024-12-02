package test;

public class Test3 {
    public static void main(String[] args) {

        int[] test = {1, 9, 2, 6, 4, 7, 3, 8};

        int max = test[0];
        int min = test[0];

        for(int i = 0; i < test.length; i++) {
            if(max < test[i] ){
                max = test[i];
            }
            if(min > test[i]){
                min = test[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
