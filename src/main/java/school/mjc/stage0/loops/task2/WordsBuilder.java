package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i =0;
        String a="";
        while (chars.length>=i){
            a+=chars[i];
            i++;
        }
        System.out.println(a);
    }
}
