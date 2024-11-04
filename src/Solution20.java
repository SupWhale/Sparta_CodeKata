import java.util.Arrays;
import java.util.Collections;

class Solution20 {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] result = s.split("");
        int[] answer2 = new int[result.length];
        for(int i=0; i<result.length; i++){
            answer2[i] = Integer.parseInt(result[i]);
        }
        Arrays.sort(answer2);
        for(int i=answer2.length-1; i>=0; i--){
            if(i == 0){
                answer += (long) (answer2[i] * 1L);
            }else{
                answer += (long) (answer2[i] * (Math.pow(10, i)));
            }
        }


        return answer;
    }
}