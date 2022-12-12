package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive==0){
            System.out.print("");
        }
        int i=0;
        int j=2;
        while (printToInclusive>=i){
            boolean prime = true;
            while (j<=Math.sqrt(i)){
                if (i%j==0){
                    prime=false;
                    break;
                }
                j++;
            }
            if (prime){
                System.out.println(i);
            }
            i++;
        }
    }
}
