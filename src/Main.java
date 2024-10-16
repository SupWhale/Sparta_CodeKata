//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static class Solution {
        Solution(){}

        public int solution1(int num1, int num2) {
            int answer = num1 - num2;
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution1(1,2);
        System.out.println(result);
    }
}