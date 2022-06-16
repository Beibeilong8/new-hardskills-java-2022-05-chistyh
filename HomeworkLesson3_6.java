public class HomeworkLesson3_6 {
    public static void main(String[] args){
        String[] arr = new String[19];
        int arrCenter = arr.length / 2;
        for(int i = 0; i < arr.length; i++){
            arr[i] = "*";
            if (i <= arrCenter ){
                for(int j = i; j > 0; j--){
                    arr[i] += "     *";
                }
            }
            else if (i > arrCenter ){
                for(int j = i - arrCenter; j <= arrCenter; j++){
                    arr[i] += "     *";
                }
            }
            System.out.println(arr[i]);
        }
    }
}
