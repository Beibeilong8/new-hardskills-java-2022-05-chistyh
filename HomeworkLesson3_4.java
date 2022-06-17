public class HomeworkLesson3_4 {
    public static void main(String[] args){
        int arr[] = new int[]{1, 0, 3, 2, 8, 1, 2, 3, 4};
        int min = 9;
        int max = 0;
        for (int i: arr) {
            if( arr[i] > max) max = arr[i];
            if( arr[i] < min) min = arr[i];
        }
        int sum = min + max;
        System.out.println(min + " + " + max + " = " + sum);
    }
}
