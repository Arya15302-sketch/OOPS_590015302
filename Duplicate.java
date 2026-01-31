class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        boolean dup = false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup = true;
                }
            }
        }

        if(dup)
            System.out.println("Duplicate found");
        else
            System.out.println("No duplicate");
    }
}
