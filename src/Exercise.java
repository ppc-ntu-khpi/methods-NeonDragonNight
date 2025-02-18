//package domain;

public class Exercise {
    public static int Calculate(int n, int m){
            if (n==0)
                return m+1;
            else
                if ((n!=0)&&(m==0))
                    return Calculate(n-1,1);
                else
                    return Calculate(n-1,Calculate(n,m-1));
    }
}
