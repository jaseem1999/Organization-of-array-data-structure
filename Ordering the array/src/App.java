public class App {
    public static void organizing(int [] array){
        for(int i = 0; i < array.length ; i++){
            for(int j = array.length - 1; j > i; j--){
                if(array[i] > array[j] ){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] array = { 6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 
                        6, 3, 2, 7, 12, 34, 56, 2, 35, 
                        6, 3, 2, 7, 12, 34 ,43 , 12, 56,
                        12, 54, 23, 45, 23, 434, 13, 1000 };
        organizing(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    
}
