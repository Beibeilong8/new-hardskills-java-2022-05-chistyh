public class HomeworkLesson3_1 {
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1, 3, 11, 2, 4, 102, 155, 171, 2990, 123, -2, -3, 18};
        for (int i: arr) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
