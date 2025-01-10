import java.util.ArrayList;
import java.util.List;
class Solution {

    public boolean isPalindrome(int x) {

        String OriginalNumStr = String.valueOf(x);
        String RightToLeftNumStr = "";

        List<Character> CharList = new ArrayList<>();

         // 負の数の場合は-を先頭に付与
        if(x < 0){
            return false;
        }
        
        List<Character> tempCharList = new ArrayList<>();
        char[] tempCharArray = OriginalNumStr.toCharArray();
        for (char ch : tempCharArray) { 
            tempCharList.add(ch);
        }
        CharList.addAll(tempCharList);

        //右から左に配置した数字を生成する
        int StrSize = CharList.size() - 1;
        for(int i = StrSize; i >= 0; i--){
            RightToLeftNumStr = RightToLeftNumStr + CharList.get(i);
        }
        System.out.print(RightToLeftNumStr);
        // 結果を判定してtrue/falseを返却
        if(OriginalNumStr.equals(RightToLeftNumStr)){
            return true;
        }else{
            return false;
        }
    }
}
