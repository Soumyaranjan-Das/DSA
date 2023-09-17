/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */

//GFG :- Flatterned a linked list
class GfG
{
    Node flatten(Node root)
    {
        if(root==null || root.next==null)
        {
            return root;
        }
        
        Node temp=root.next;
        while(temp!=null)
        {
            root=merge(root,temp);
            temp=temp.next;
        }
        return root;
    }
    public static Node merge(Node left,Node right)
    {
        if(left==null) return right;
        if(right==null) return left;
        
        Node ans=new Node(0);
        Node temp=ans;
        while(left!=null && right!=null)
        {
            if(left.data<right.data)
            {
                temp.bottom=left;
                temp=temp.bottom;
                left=left.bottom;
            }
            else
            {
                temp.bottom=right;
                temp=temp.bottom;
                right=right.bottom;
            }
        }
        if(left!=null)
        {
            temp.bottom=left;
        }
        if(right!=null)
        {
            temp.bottom=right;
        }
        
        return ans.bottom;
        
    }
}