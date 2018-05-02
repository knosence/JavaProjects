class Bubblesort {
    public static void main(String[] args) {
        int[] listOfNumber = { 3,1,9,1,4,5 };
        int[] sortedList = bubblesort(listOfNumber);
        for(int number : sortedList){
            System.out.println(number);
        }    
    }

    public static int[] bubblesort(int[] numbers) {
        int n = numbers.length;

        int temp = 0;

        for (int i = 0; i < n; i++) {
            for(int j = 1; j<n; j++){
                if(numbers[j] < numbers[j-1]){
                    temp = numbers[j];
                    numbers[j]= numbers[j-1];
                    numbers[j-1] = temp;
                }
            }            
        }
        return numbers;
    }

}