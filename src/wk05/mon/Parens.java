package wk05.mon;
//Using stack to check for balanced parentheses
public class Parens {

    public static boolean isBalanced(String w) {
        Stack s = new Stack();
        for(int i = 0; i < w.length(); i++) {
            if(w.charAt(i) == '(') {
                s.push(w.charAt(i));
            } else if(w.charAt(i) == ')') {
                if(s.isEmpty()) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
//        if(s.isEmpty()) {
//            return true;
//        } else {
//            return false;
//        }

    }

    public static void main(String[] args) {
        String word = "hello";
        String balanced = "()()(())";

        String unbalanced = "()()())";
        System.out.println("Is " + balanced + " balanced? " + isBalanced(balanced));
        System.out.println("Is " + unbalanced + " balanced? " + isBalanced(unbalanced));
//        Stack s = new Stack();
//        for(int i = 0; i < word.length(); i++) {
//            System.out.println("pushing " + word.charAt(i));
//            s.push(word.charAt(i));
//        }
//
//        System.out.println(s);
//
//        while(! s.isEmpty()) {
//            System.out.println("popping stack value: " + s.top());
//            s.pop();
//        }
//        System.out.println(s);
    }
}

