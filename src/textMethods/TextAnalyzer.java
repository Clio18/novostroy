package textMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TextAnalyzer {
    public void makeSentence(String text){
           String s = text.replaceAll("[^\\w]", "").toLowerCase();
        System.out.println(s);
    }

    public void makeSentenceHard(String text){
        char[] chars = text.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (61 < (byte) chars[i] && 122 > (byte) chars[i]) {
                stringBuilder.append(chars[i]);
            }
        }
        System.out.println(stringBuilder);
    }

    public Map makeNumberOfUnicWords (String text){
        String s = text.replaceAll("[^\\w]", " ").toLowerCase();
        String[] list = s.split(" ");
        ArrayList list1 = new ArrayList();
        list1.addAll(Arrays.asList(list));
        ArrayList list2 = new ArrayList();
        list2.addAll(Arrays.asList(list1
                                       .stream()
                                       .filter(f->!f.equals(""))
                                       .toArray()));
        HashMap map = new HashMap();
        for (int i = 0; i < list2.size(); i++) {
            int k = 0;
            for (int j = 0; j < list2.size(); j++) {
                if (list2.get(i).equals(list2.get(j))) {
                    k++;
                }
            }
            map.put(list2.get(i), k);
        }
        return map;
    }
}
