package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive==0){
            System.out.println(1);
        }
        int i = 1;
        while (printToInclusive>=i){
            int a =1;
            System.out.println(a*=i);
            i++;
        }
    }
}
