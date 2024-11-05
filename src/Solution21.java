class Solution21 {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        String[] result = s.split("");
        int ans = 0;
        for(int i=0; i<result.length; i++){
            ans += Integer.parseInt(result[i]);
        }

        if(x%ans == 0){
            answer = true;
        }else{
            answer = false;
        }


        return answer;
    }
}