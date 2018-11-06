package main.java.leetcode;

/**
 * 描述:
 * 宝石与石头
 *
 * @Author he
 * @Create 2018-11-06 9:20 PM
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA";String S = "aAAbbbb";
        int num = numJewelsInStones(J,S);
        System.out.println(num);
    }

    public static int numJewelsInStones(String J, String S) {
        int size = S.length();
        int i=0;
        int result=0;
        while (i < size){
            if(J.indexOf(S.charAt(i)) != -1){
                result++;
            }
            i++;
        }
        return result;

    }

}