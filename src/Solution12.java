class Solution12 {
    public double solution12(int[] arr) {
        double answer = 0;
        double result = 0;
        for(int i=0; i<arr.length; i++){
            result += arr[i];
        }
        answer = result/arr.length;
        return answer;
    }
}