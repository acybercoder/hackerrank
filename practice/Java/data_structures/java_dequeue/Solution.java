package hackerrank.java.data_structures.java_dequeue;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        
        int maxNum = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num); 			//addLast()
            if(map.containsKey(num)){
            	map.put(num, map.get(num)+1);
            } else
            	map.put(num, 1);
            
            if(deque.size()==m+1) {
            	int remove = deque.remove(); //removeFirst()
            	if(map.get(remove)>1)
            		map.put(remove, map.get(remove)-1);
            	else
            		map.remove(remove);
            }
            
            if(deque.size()==m) {
            	maxNum = (map.size()> maxNum)? map.size():maxNum;
            }
        }
        in.close();
        System.out.println(maxNum);
    }
}
