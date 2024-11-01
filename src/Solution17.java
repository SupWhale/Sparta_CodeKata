class Solution17  {
    public int[] solution17(long n) {
        String s = Long.toString(n);
        String[] result = s.split("");
        int[] answer = new int[result.length];
        for(int i=0; i<result.length; i++){
            answer[i] = Integer.parseInt(result[result.length-i-1]);
        }
        return answer;
    }
}