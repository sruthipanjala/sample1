public class Bubblesort {

    public static void bubblesort(int arr[],int n) {
        for(int i=0;i<n-1;i++){
            boolean chk = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    chk = false;
                }
            } if(chk) break;
        }
    } // TIME : WORST & AVERAGE(N**2) Best(1) | SPACE : O(1)
    public static void main(String[] args) {
        int arr[] = new int[]{23,234,5,2345,23,45,23,22,345,2,1};
        int n = arr.length; bubbleSort(arr, n);
        for(int i: arr) System.out.print(i + " ");
    }       

}

