class Solution14 {
    public int solution14(int n) {
        int answer = 0;
        for(int i=1; i<=n/2; i++){
            if (n%i == 0)
                answer += i;
        }
        return answer+n;
    }
}