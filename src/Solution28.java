class Solution28 {
    public int solution(int[] numbers) {

        int result = 1+2+3+4+5+6+7+8+9;
        for(int i=0; i<numbers.length; i++){
            result -= numbers[i];
        }
        int answer = result;
        return answer;
    }
}