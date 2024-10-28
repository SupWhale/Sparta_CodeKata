import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        //int result = solution.solution1(1,2);

        Solution2 solution2 = new Solution2();
        //int result2 = solution.solution1(1,2);

        Solution3 solution3 = new Solution3();
        //int result = solution.solution1(4,2);

        Solution4 solution4 = new Solution4();
        //int result = solution4.solution(4,2);

        Solution5 solution5 = new Solution5();
        //int result = solution5.solution(40);

        Solution6 solution6 = new Solution6();
        //int result = solution6.solution(40, 70);

        //int result = 0;

        int[] asd = {1, 2, 1, 3, 1, 4, 1, 2};

        Solution99 solution99 = new Solution99();
        //int result = solution99.solution(asd);

        Solution7 solution7 = new Solution7();
        //int result = solution7.solution(3, 2);

        Solution8 solution8 = new Solution8();
        //int result = solution8.solution(90);

        Solution9 solution9 = new Solution9();
        //int result = solution9.solution(90);

        Solution10 solution10 = new Solution10();
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //double result = solution10.solution(num);

        Solution11 solution11 = new Solution11();
        // result = solution11.solution11(4);

        Solution12 solution12 = new Solution12();
        //double result = solution12.solution12(num);

        Solution13 solution13 = new Solution13();
        int result = solution13.solution13(1234);

        System.out.println(result);

    }
}