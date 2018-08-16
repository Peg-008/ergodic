/**
 * Copyright (C), 2018-2018
 * FileName: TreeNode
 * Author:   sky丶风
 * Date:     2018/8/15 14:55
 * Description: 二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.robot.ergodic;
/**
 * 〈一句话功能简述〉<br> 
 * 〈二叉树〉
 *
 * @author sky丶风
 * @create 2018/8/15
 * @since 1.0.0
 */
public class TreeNode {
        private int data;
        private  TreeNode left;
        private  TreeNode right;

        public TreeNode() {
        }
        public TreeNode(int data,TreeNode left, TreeNode right) {
            this.data=data;
            this.left = left;
            this.right = right;
        }

        public TreeNode getLeft() {
            return left;
        }
     public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    public void print(int data) {
        System.out.print(data+ " ");
    }
}