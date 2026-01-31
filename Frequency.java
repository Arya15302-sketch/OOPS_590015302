class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,4};
        int key = 2, count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}
