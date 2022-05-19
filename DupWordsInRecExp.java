package COM.BRIDGELABZ;
import java.util.*;
public class DupWordsInRecExp {

    public static void main(String[] args){

            String expression= "HI IAM SRILAKSHMI";
            String[]words = expression.split("\\W");

            Map<String,Integer>word_map= new HashMap<>();
            for  (String word : words)
            {
            if (word_map.get(word) != null)
            {
                word_map.put(word,word_map.get(word) +1);
            }
            else{
                word_map.put(word, 1);
            }
            }
            Set<String>word_set= word_map.keySet();
            for (String word : word_set){
    if (word_map.get(word) > 1)

            System.out.println(word);
    }
}
}





