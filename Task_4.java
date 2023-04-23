import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_4 {

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    // result [6,6,0,1]
    Task_4 taskPrint = new Task_4();
    Deque<Integer> result = taskPrint.sum(d1, d2);
    System.out.println(result);
}


public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

    Deque<Integer> result = new ArrayDeque<>();
    while (d1.size() > 0){
        int value = d1.pollLast() + d2.pollLast();
        if (value > 9){
            while (value != 0){
                int num;
                num = value%10;
                result.addFirst(num);
                value = value/10;
            }
        }

        else {
            result.addFirst(value);
        }
    }
    
    return result;
}
}
