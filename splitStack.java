/** Class: SplitStack.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 11/3/2022
*
* This class - Takes a stack of integers as a parameter and splits it into negatives and non-negatives
*//

  
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack 
{
    public static void main(String[] args) 
    {
        Stack<Integer> n0 = new Stack<Integer>();
        n0.push(new Integer(5));
        n0.push(new Integer(-5));
        n0.push(new Integer(67));
        n0.push(new Integer(-45));
        n0.push(new Integer(67));
        n0.push(new Integer(9));
        n0.push(new Integer(0));
        n0.push(new Integer(-42));
        n0.push(new Integer(56));
        n0.push(new Integer(-7));
        System.out.println(n0);

        SplitStack(n1);
        System.out.println(n1);
        Stack<Integer> n1 = new Stack<Integer>();
        n1.push(1);
        n1.push(-2);
        n1.push(-3);
        n1.push(4);
        n1.push(-5);
        n1.push(6);
        n1.push(-7);
        n1.push(8);
        n1.push(-9);
        System.out.println(n1);
        splitStack(n1);
        System.out.println(n1);

    }


    public  static void splitStack(Stack<Integer> n0) 
    {
        reverseStack(n0);
        Queue<Integer> list0 = new LinkedList<Integer>();
        int negNums = 0;

        while(!n0.isEmpty()) 
        {
            if(n0.peek() < 0)
                negNums++;
            list0.add(n0.pop());
        }

        while(negNums > 0) 
        {
            if(list0.peek() < 0) 
            {
                n0.push(list1.remove());
                negNums--;
            } 
          
          else 
            {
                list0.add(list0.remove());
            }
        }

        while(!list0.isEmpty()) 
        {
            if(n0.peek() == -9)
            {
                n0.pop();
                n0.push(9);
            }
            n0.push(list0.remove());
        }
    }
    public static void reverseStack(Stack<Integer> n0) 
    {
        Queue<Integer> reverseStack = new LinkedList<>();
        while(!n0.empty())
        {
            reverseStack.add(n0.pop());
        }
        for (Integer integer : reverseStack) 
        {
            n0.push(integer);
        }
    }
}
