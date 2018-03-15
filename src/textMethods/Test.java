package textMethods;

import java.util.ArrayList;

import static java.util.stream.Collectors.joining;

public class Test {
    public static void main(String[] args) {
        String text = "Wnnn mm, jj-mmm. Nn mmm: wnnn, mm, mm, mm! RteOlm";
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        textAnalyzer.makeSentence(text);
        System.out.println(textAnalyzer.makeNumberOfUnicWords(text));
        textAnalyzer.makeSentenceHard(text);




    }
}
