class Solution15 {
    public int solution15(int n) {
        int answer = 0;
        int x = 1;
        while(n%x != 1){
            x++;
        }
        answer = x;
        return answer;
    }
}