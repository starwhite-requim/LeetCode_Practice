package pract;


class ListNode {
    int val;
    ListNode next = null;
   public ListNode(int val) {
     this.val = val;
   }
  }

/**
 * 给定一个单链表的头结点pHead(该头节点是有值的，比如在下图，它的val是1)，长度为n，反转该链表后，返回新链表的表头。
 * 如当输入链表{1,2,3}时，
 * 经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
 */
public class JZ24_反转链表 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode ReverseList (ListNode head) {
        // write code here
        //递归，递归无法找到上一级的节点
        //递归可以找到上一级节点，最后返回的节点会送给上一级
        if (head == null||head.next == null){
            return head; //返回最后一个节点
        }
        //递归调用进行处理
        ListNode currentTail = ReverseList(head.next);
        //自己的下一个当为新链表中上一位
        head.next.next = head;
        //要断开链表防止形成环
        head.next = null;

            //递归的结束条件，递归到了最后一个
            //当调用到了最后一个节点，会 再次调用ReverseList ，head.next 此时 if语句失效，不再进行递归调用



        return currentTail; // returnCurrentTail是保留了最底部调用的结果， 最底部返回之后，上一层使用currentTail接收，并且作为返回值返回
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode newHead = l3;
        head.next = l2;
        l2.next = l3;
        ListNode listNode = new JZ24_反转链表().ReverseList(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
