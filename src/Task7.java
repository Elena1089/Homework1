public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,6,65,5,3,232};
        int sum = 0;

        for (int i = 0; i <= array.length -1 ; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}