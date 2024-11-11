class Solution27 {
    public String solution27(String phone_number) {
        String answer = "";
        String[] result = phone_number.split("");
        for(int i=0; i<phone_number.length(); i++){
            if(i < phone_number.length()-4){
                answer += "*";
            }else{
                answer += result[i];
            }
        }
        return answer;
    }
}