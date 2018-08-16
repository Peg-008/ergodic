/**
 * Copyright (C), 2018-2018
 * FileName: Preface
 * Author:   sky丶风
 * Date:     2018/8/15 14:39
 * Description: 二叉树递归、非递归遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.robot.ergodic;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树递归先序遍历〉
 *
 * @author sky丶风
 * @create 2018/8/15
 * @since 1.0.0
 */
public class BinaryTree {
    private TreeNode root;
    public BinaryTree() {}
    public BinaryTree(TreeNode root) {
        this.root = root;
    }
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
        /*
         * 前序遍历，递归实现
         * */
    public static void preOrder(TreeNode root) {
        if (root != null) {
            root.print(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
        /*
         * 前序遍历，非递归实现
         * 1，先入栈根节点，输出根节点val值，再先后入栈其右节点、左结点；
         * 2，出栈左节点，输出其val值，再入栈该左节点的右节点、左节点；直到遍历完该左节点所在子树。
         * 3，再出栈右节点，输出其val值，再入栈该右节点的右节点、左节点；直到遍历完该右节点所在子树。
         * */
    public static void iteratePreOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            // 当遇到节点时，将所有左节点压入栈中
            while (node != null) {
                node.print(node.getData());
                stack.push(node);
                node = node.getLeft();
            }
            if (stack.size() > 0) {
                node = stack.pop();
                node = node.getRight();
            }
        }
    }
        /*
         * 中序遍历，递归实现
         * */
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            root.print(root.getData());
            inOrder(root.getRight());
        }
    }
        /*
         * 中序遍历，非递归实现
         * 1，首先从根节点出发一路向左，入栈所有的左节点；
         * 2，出栈一个节点，输出该节点val值，查询该节点是否存在右节点，
         * 若存在则从该右节点出发一路向左入栈该右节点所在子树所有的左节点；
         * 3，若不存在右节点，则出栈下一个节点，输出节点val值，同步骤2操作；
         * 4，直到节点为null，且栈为空。
         * */
    public static void iterateInOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            // 当遇到节点时，将所有左节点压入栈中
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            if (stack.size() > 0) {
                node = stack.pop();
                node.print(node.getData());
                node = node.getRight();
            }
        }
    }
        /*
         * 后序遍历，递归实现
         * */
    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            root.print(root.getData());
        }
    }
    /**
     * 非递归后序遍历
     * @param root
     */
    public static void iteratePostOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> temp = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            while (node != null) {
                stack.push(node);
                temp.push(node);
                node = node.getRight();
            }

            if (stack.size() > 0) {
                node = stack.pop();
                node = node.getLeft();
            }
        }
        while (temp.size() > 0) {
            node = temp.pop();
            node.print(node.getData());
        }
    }
        /*
         * 层序遍历（广度优先遍历）
         * */
        public static void LayerOrder(TreeNode root) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            TreeNode node=root;
            if (node != null) queue.offer(node);
            while (!queue.isEmpty()) {
                node= queue.poll();
                node.print(node.getData());
                if (node.getLeft() != null) queue.offer(node.getLeft());
                if (node.getRight() != null) queue.offer(node.getRight());
            }
        }
}