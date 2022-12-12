package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive==0){
            System.out.println("");
        }
        int i=0;
        if (multiplyByAndToInclusive<0){
            while (multiplyByAndToInclusive<=-i){
                System.out.println(multiplyByAndToInclusive*i);
                i++;
            }
        }else {
            while (multiplyByAndToInclusive>=i){
                System.out.println(multiplyByAndToInclusive*i);
                i++;
            }
        }

    }
}
