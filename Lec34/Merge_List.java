package Lec34;

public class Merge_List {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {
		    	  
		      }
		      ListNode(int val) { 
		    this.val = val; }
		      
		      ListNode(int val, ListNode next) { 
		    	  this.val = val; this.next = next; }
		      }
		 
		 
		class Solution {
		    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		        ListNode temp = new ListNode();
		        ListNode ans = temp ;
		        while(list1!=null && list2!=null){
		            if(list1.val < list2.val){
		                 temp.next= list1;
		                temp = temp.next;
		                list1= list1.next;
		                
		               
		                
		            }
		            else{
		                 temp.next= list2;
		                temp = temp.next;
		                list2= list2.next;
		                
		            }
		            
		            
		        }
		            if (list1==null){
		                temp.next= list2;
		            }
		             if (list2==null){
		                temp.next= list1;
		            }
		            
		        
		                return ans.next;

		        
		    }
		}
}