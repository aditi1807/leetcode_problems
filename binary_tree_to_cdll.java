class Solution
{ 
    static void inorder(Node root,List<Integer>arr){
        if(root==null)
        return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
}
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        List<Integer>arr=new ArrayList<>();
        inorder(root,arr);
        Node head=new Node(arr.get(0));
        Node st=head;
        for(int i=1;i<arr.size();i++)
        {
            Node nw=new Node(arr.get(i));
            st.right=nw;
            nw.left=st;
            st=st.right;
        }
        st.right=head;
        head.left=st;
        return head;
        
        
    }
    
}