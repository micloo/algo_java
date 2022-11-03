public class Zero {
    public static void main(String[] args){
        int [] numbers = {-1,5,-6,50,10};
        int closest = 0;
    
        for (int i = 0; i < numbers.length ; i++) {
            if (closest == 0) {
                closest = numbers[i];
            } else if (numbers[i] > 0 && numbers[i] <= Math.abs(closest)) {
                closest = numbers[i];
            } else if (numbers[i] < 0 && - numbers[i] < Math.abs(closest)) {
                closest = numbers[i];
            }
        }
        System.out.println(closest);
    }
}
