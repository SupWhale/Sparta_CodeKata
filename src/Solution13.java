import java.util.*;

public class Solution13 {
    public int solution13(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}