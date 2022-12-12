package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive==0){
            System.out.println("");
        }
        int i=2;
        int j=2;
        while (printToInclusive>=i){
            boolean prime = true;
            while (j<=i/2){
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
