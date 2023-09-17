
//LeetCode :-(2058) 
/*A critical point in a linked list is defined as either a local maxima or a local minima.

A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.

A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.

Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.

Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] 
where minDistance is the minimum distance between any two distinct critical points and 
maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1]. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        ListNode prev=head;
        if(prev==null) return ans;
        ListNode curr=head.next;
        if(curr==null) return ans;
        ListNode nxt=head.next.next;
        if(nxt==null) return ans;
        int max=-1,min=Integer.MAX_VALUE;
        int firstPoint=-1,lastPoint=-1;
        int i=1;
        while(nxt!=null)
        {
            if((curr.val<prev.val && curr.val<nxt.val)||(curr.val>prev.val && curr.val>nxt.val))
            {
                if(firstPoint==-1)
                {
                    firstPoint=i;
                }
                if(lastPoint!=-1 && i-lastPoint<min)
                {
                    min=i-lastPoint;
                }
                lastPoint=i;
            }
            i++;
            prev=curr;
            curr=nxt;
            nxt=nxt.next;
        }
        if(firstPoint!=-1 && lastPoint!=-1 && min!=Integer.MAX_VALUE)
        {
            ans[0]=min;
            ans[1]=lastPoint-firstPoint;

        }
        return ans;
    }
}