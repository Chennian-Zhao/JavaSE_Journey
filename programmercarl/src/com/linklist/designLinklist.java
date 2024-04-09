package com.linklist;

public class designLinklist {
    int size;
    ListNode head;
    //初始化列表
    public designLinklist(){

        size = 0;
        //这里先初始化了头节点，所以有意义的第一个节点其实是头节点指向的节点
        head = new ListNode(0);
    }
    //获取第index位置的值
    //int get(int index) 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1
    public int get(int index){
        if(index< 0||index >= size) return -1;
        ListNode cur = head;
        //题目里面说下标是index ，所以是第index+1个节点
        //包含一个虚拟头节点，所以查找第 index+1 个节点
        for (int i = 0; i <= index; i++) {
            //小于等于是cur，小于是前置
            //第0个位置的值，就是第1个节点，存在一个虚拟头节点
            cur = cur.next;
        }
        return cur.val;
    }
    //在链表最前面插入一个节点，等价于在第0个元素前添加
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //在链表的最后插入一个节点，等价于在(末尾+1)个元素前添加
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    // 在第 index 个节点之前插入一个新节点，例如index为0，那么新插入的节点为链表的新头节点。
    // 如果 index 等于链表的长度，则说明是新插入的节点为链表的尾结点
    // 如果 index 大于链表的长度，则返回空
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;
        //找到要插入节点的前驱
        ListNode pred = head;
        //小于，就可以找到前驱
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        //前驱节点的next 是后驱节点的next
        //前面的节点指向的节点，应该放到新加入的节点的next
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    //删除第index个节点
    public void deleteAtIndex(int index) {
        if(index < 0|| index>=size) return ;
        size --;
        if(index == 0){
            head = head.next;
            return;
        }
        ListNode pred = head;
        //在这个修正后的版本中，当 index = 0 时，我们实际上是在删除头节点的下一个节点，也就是链表的第一个实际节点。
        for (int i = 0; i < index; i++) {
            //不加等于，0的时候，进不来，1的时候，进来一次，总共两个元素，出去的时候，指向第一个元素
            //加了等于，0的时候，进来，总共一个元素，指向第一个元素
            //所以，< 是前一个元素，0的时候就是虚拟头节点，<=就是当前元素
            pred = pred.next;
        }
        //右边是元素，左边是指针
        pred.next = pred.next.next;

    }
}
