import java.util.Stack;
import java.util.Scanner;
public class ClassAssignmentQ1 {
        static int[] stack =new int[100];
        static int count=0;
        static int top=0;
        static void push(int data) {
            stack[count]=data;
            top=count;
            count++;

        }
        static void pop() {
            if(stack.length==0) {
                System.out.println("Stack is Empty You can't pop element");
            }
            else{
                System.out.println("poped element is "+ stack[top]);
                count--;
                top=count;
            }
        }
        static boolean isEmpty() {
            if(stack.length==0) {
                return true;
            }
            else {
                return false;
            }
        }
        static boolean isFull() {
            return stack.length == 50;
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            while(true) {
                System.out.println("Q1. Push Element in Stack");
                System.out.println("Q2. Pop Element in Stack");
                System.out.println("Q3. Check Stack is wheather empty or not");
                System.out.println("Q4.Check Stack is wheather Full or not");
                int a;
                Scanner sc= new Scanner(System.in);
                a=sc.nextInt();

                switch(a) {
                    case 1:{
                        System.out.println("Enter element");
                        int data;
                        data=sc.nextInt();
                        push(data);
                        break;

                    }
                    case 2:pop();
                        break;
                    case 3:{
                        System.out.println(isEmpty());
                        break;
                    }
                    case 4:{
                        System.out.println(isFull());
                        break;
                    }
                }
            }
        }
}