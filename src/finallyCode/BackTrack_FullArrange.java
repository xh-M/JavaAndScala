package finallyCode;

import java.util.*;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/19
 */
public class BackTrack_FullArrange {
    public static void main(String[] args) {
        String str = "cba";
        Permutation(str);
        System.out.println(result);
    }

    public static TreeSet<String> result = new TreeSet<>();
    private static ArrayList<String> Permutation(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        LinkedList<String>track = new LinkedList<>();
        backTrack(chars, track);
        return new ArrayList<String>(result);
    }

    private static void backTrack(char[] chars, LinkedList<String> track) {
        for(String s : track){
            System.out.println(s);
        }
        if(track.size() == chars.length){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < track.size(); i++) {
                sb.append(track.get(i).split("_")[1]);
            }
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            String s = i +"_"+chars[i];
            if(track.contains(s))
                continue;
            track.add(s);
            backTrack(chars,track);
            track.removeLast();
        }
    }
}
