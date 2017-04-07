import java.util.*;
import java.io.*;

class Node {
    int val;
    Node left, right;
 
    public Node(int val)
    {
        this.val = val;
    }
}

public class Solution {
    
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        s.nextLine();

       	for (int i = 0; i < count; i++) {
       		int numCount = s.nextInt();
       		s.nextLine();

       		int[] numbers = new int[numCount];
            
            

       		for (int j = 0; j < numCount; j++) {
       			numbers[j] = s.nextInt();
       		}

       		boolean istrue = isBST(createNode(numbers, numCount));
            System.out.println(istrue);
       		s.nextLine();
       	}
    }

    Node createNode(Int[] input, int index) {
    if (index <= input.length) {
        Integer value = input[index-1];
        if(value!=null){
            Node n = new Node(value);
            n.left = createNode(input, index * 2);
            n.right = createNode(input, index * 2 + 1)
            return n;
        }
    }
    return null;
}

    boolean isBST(Node node) {
        if (node != null)
        {
            if (!isBST(node.left))
                return false;
 
            if (left != null && node.val <= left.val )
                return false;
            left = node;
            return isBST(node.right);
        }
        return true;
    }
}