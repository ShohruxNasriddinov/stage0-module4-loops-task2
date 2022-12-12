package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive==0){
            System.out.print("");
        }
        int j=2;
        for (int k = 0; k <= printToInclusive; k++) {
            boolean prime = true;
            while (j<=Math.sqrt(k)){
                if (k%j==0){
                    prime=false;
                    break;
                }
                j++;
            }
            if (prime){
                System.out.println(k);
            }
        }
    }
}
