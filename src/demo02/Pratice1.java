package demo02;

public class Pratice1 {
    public static void main(String[] args) {
        System.out.println(multiply(5,2));
        convert(434324323L);
        sort();
        filtArray(new int[]{1,2,3,4,5,2,3});
    }
    public static int multiply(int a,int b){
        return a * b;
    }
    public static void convert(long minutes){
        long years = minutes / 525600;
        double days = (minutes % 525600) / 1440;
        System.out.println(minutes + "分钟是" + years + "年" + days + "天");
     }
     public static void sort() {
         int count = 0;
         for (int one = 1; one < 150; one++) {
             for (int two = 1; two < 75; two++) {
                 for (int five = 1; five < 30; five++) {
                     if (one + two + five == 100 && one + two * 2 + five * 5 == 150) {
                         count++;
                         System.out.println("可以兑换1分" + one + "个2分" + two + "个5分" + five + "个");
                     }
                 }
             }
         }
         System.out.println(count);
     }
     public static void filtArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[arr.length - 1];
                    j--;
                }
            }
        }
     }
}
