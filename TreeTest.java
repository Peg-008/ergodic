/**
 * Copyright (C), 2018-2018
 * FileName: TreeTest
 * Author:   sky丶风
 * Date:     2018/8/15 16:57
 * Description: 递归遍历二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.robot.ergodic;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈递归遍历二叉树〉
 *
 * @author sky丶风
 * @create 2018/8/15
 * @since 1.0.0
 */
public class TreeTest {
    TreeNode root=new TreeNode();
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Data data=new Data();
        //初始化
        data.init(bt);
        //bt.preOrder(bt.getRoot());
        //bt.inOrder(bt.getRoot());
        //bt.postOrder(bt.getRoot());
        //bt.iteratePreOrder(bt.getRoot());
        bt.iterateInOrder(bt.getRoot());
        //bt.iteratePostOrder(bt.getRoot());
        //bt.LayerOrder(bt.getRoot());
    }

}