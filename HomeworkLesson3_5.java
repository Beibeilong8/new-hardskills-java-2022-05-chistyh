public class HomeworkLesson3_5 {
    public static void main(String[] args){
        String[] arr = new String[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = "*";
            for(int j = i; j > 0; j--){
                arr[i] += "*";
            }
            System.out.println(arr[i]);
        }
    }
}
