# Практична робота "Створення і використання статичних методів"

## Обчислити значення функції Аккермана для двох невідʼємних цілих чисел n та m

Exercise
``` java
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
```

TestResult
``` java
public class TestResult {

    public static void main(String[] args) {

        int n=1;
        int m=4;
        System.out.println("Ackermann function n,m is "+Exercise.Calculate(n,m));
    }
}
```

## Результат
![](Result.png)