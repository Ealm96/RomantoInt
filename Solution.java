public class Solution{
   public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;
        String error = "Something went wrong!";
        for(int i = s.length() - 1; i > -1; i--){
            switch(s.charAt(i)){
                case 'I':
                    if(prev == 5 || prev == 10){
                        ans -= 1;
                        prev = 1;
                    } else{
                        ans += 1;
                        prev = 1;
                    }
                    break;
                case 'V':
                    ans += 5;
                    prev = 5;
                    break;
                case 'X':
                    if(prev == 50 || prev == 100){
                        ans -= 10;
                        prev = 10;
                    } else{
                        ans += 10;
                        prev = 10;
                    }
                    break;
                case 'L':
                    ans += 50;
                    prev = 50;
                    break;
                case 'C':
                    if(prev == 500 || prev == 1000){
                        ans -= 100;
                        prev = 100;
                    } else{
                        ans += 100;
                        prev = 100;
                    }
                    break;
                case 'D':
                    ans += 500;
                    prev = 500;
                    break;
                case 'M':
                    ans += 1000;
                    prev = 1000;
                    break;
                default:
                    System.out.println(error);
                    break;
            }
        }
        return ans;
    }
}
