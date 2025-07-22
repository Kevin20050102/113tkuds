import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReversePrint {
    public static void printReverse(ListNode head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入節點個數：");
        int n = sc.nextInt();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        System.out.println("輸入節點值：");
        for (int i = 0; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }

        System.out.print("反向列印結果：");
        printReverse(dummy.next);
    }
}

