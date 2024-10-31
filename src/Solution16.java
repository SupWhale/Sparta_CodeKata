class Solution16 {
    public long[] solution16(int x, int n) {
        long[] answer = new long[n];
        long sumNum = x;
        for(int i=0; i<n; i++){
            answer[i] = sumNum;
            sumNum += x;
        }
        return answer;
    }
}