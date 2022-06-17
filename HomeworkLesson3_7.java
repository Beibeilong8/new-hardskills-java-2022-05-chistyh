public class HomeworkLesson3_7 {
    public static void main(String[] args){
    String[] arr = new String[9];
    int fieldValue = 0;
        for ( int i = 0; i < arr.length; i++ ){
            if ( i % 2 == 0 ) arr[i] = "0    ";
            else {
                fieldValue += 2;
                arr[i] = fieldValue + "    ";
            }
            if ( (i + 1) % 3 == 0 ) System.out.println(arr[i]);
            else System.out.print(arr[i]);
        }
    }
}
