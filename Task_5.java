import java.util.ArrayDeque;
import java.util.Deque;

public class Task_5 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static void main(String[] args) {

    String example = ")()("; // Задаем строчку, которую надо проверить на условие из задачи


    String openSymbols  = "({["; 
    String closeSymbols = ")}]"; 
    boolean result = true;
    Deque<Character> deque = new ArrayDeque<>();
    char[] symbols = example.toCharArray();
    for (char ch : symbols) {
        if (openSymbols.indexOf(ch) >= 0) {
            deque.offerFirst(ch);
        } 
        else {
            int index = closeSymbols.indexOf(ch);
            if (index >= 0) {
                if (deque.size() == 0 || deque.pollFirst() != openSymbols.charAt(index)) {
                    result = false;
                    break;
                }
            }
        }
        if (!result)
            break;
    }
    
    System.out.println(result);
    }
}
