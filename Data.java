/**
 * Copyright (C), 2018-2018
 * FileName: Data
 * Author:   sky丶风
 * Date:     2018/8/15 15:59
 * Description: 节点数据
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.robot.ergodic;

import sun.reflect.generics.tree.Tree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈节点数据〉
 *
 * @author sky丶风
 * @create 2018/8/15
 * @since 1.0.0
 */
public class Data {
    public static void init(BinaryTree bt) {
        TreeNode E = new TreeNode(5, null, null);
        TreeNode F = new TreeNode(6, null, null);
        TreeNode C = new TreeNode(3, E, null);
        TreeNode D = new TreeNode(4, null, F);
        TreeNode B = new TreeNode(2, C, D);
        TreeNode H = new TreeNode(8, null, null);
        TreeNode G = new TreeNode(7, H, null);
        TreeNode A = new TreeNode(1, B, G);
        bt.setRoot(A);
    }
}