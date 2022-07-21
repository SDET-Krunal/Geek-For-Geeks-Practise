package src.Problem_Of_The_Day.Stack;

import java.util.Stack;

public class minimum_in_stack_after_pop {

    public static Stack<Integer> _push(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
        }

        return st;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        // your code here
    }

    public static void print_stack(Stack<Integer> st) {
        while (!st.empty()) {
            System.out.print(st.pop() + "\t");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 6, 43, 1, 2, 0, 5};

        Stack<Integer> st = _push(a, a.length);
        System.out.println("Elements after pushing into Stack :: ");
        print_stack(st);

        System.out.println("Minimum element after popping element from top :: ");
        _getMinAtPop(st);
    }
}


//Output:
//--------
//Elements after pushing into Stack ::
//5	0	2	1	43	6	1
//
//Minimum element after popping element from top ::
//0 0 1 1 1 1 1
//
//Explanation:
//-------------
//After pushing the elements to the stack, the stack will be 5->0->2->1->43->6->1.
//
//Now, poping the elements from the stack:
//- popping 5  : min in the stack is 0. popped 5.
//- popping 0  : min in the stack is 0. popped 0.
//- popping 2  : min in the stack is 1. popped 2.
//- popping 1  : min in the stack is 1. popped 1.
//- popping 43 : min in the stack is 1. popped 43.
//- popping 6  : min in the stack is 1. popped 6.
//- popping 1  : min in the stack is 1. popped 1.
