
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_3 {

// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,1,2,3,3,2,1,6));
    System.out.println(checkOn(deque));
}


public static boolean checkOn (Deque<Integer> deque){
    while (deque.peek() != null) {
        int value = deque.pollFirst() - deque.pollLast();
        if (value != 0){
            return false;
        }
        else {
            return true;
        }
    }
    return false;
}
}
