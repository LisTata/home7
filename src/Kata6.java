public class Kata6 {

    public static void main(String[] args) {

        System.out.println( findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    }
    //6 kyu
    //Equal Sides Of An Array
    //You are going to be given an array of integers. Your job is to take that array and find an index N
    // where the sum of the integers to the left of N is equal to the sum of the integers to the right of N.
    // If there is no index that would make this happen, return -1.


    public static int findEvenIndex(int[] arr) {
        int index=-1;


        for(int i =0;i<arr.length;i++){
            int sumLeft=0;
            int sumRight=0;

            for(int j=0;j<i;j++)
                sumLeft+=arr[j];
            for(int k =i+1;k<arr.length;k++)
                sumRight+=arr[k];
            if(sumLeft==sumRight){
                index=i;
                break;
            }
            else{
                sumLeft=0;
            sumRight=0;}
        }

        return index;
    }
}
