public class HomeworkLesson3_2 {
    public static void main(String[] args){
        int arr[] = new int[]{0, 4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};
        long result = 1;
        for (int i: arr) {
            if (i % 5 == 0 && i != 0) result *= i;
        };
        System.out.println("Произведение всех чисел массива, кратных 5 = " + result);
    };
};
