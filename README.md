# analyze-HashMap
HashMap源码分析

## HashMap特点
1. 使用hash表(桶)和每个桶里面有链表(或红黑树)组成
2. 有两个限制值
    + 链表长度(或红黑树大小) 单独控制:如果超过阈值，链表会转红黑树，如果低于阈值，红黑树会转链表
    + 整个HashMap容量:如果超过阈值，也会扩容桶
3. 桶的数量必定是2^n(如果超过2^30，则把HashMap容量扩容成int.max)
4. 普通的链表是单向的，如果转红黑树，HashMap特色，红黑树也是双向链表
5. [红黑树](https://github.com/lilingyan/take-TreeMap-apart)知识参考