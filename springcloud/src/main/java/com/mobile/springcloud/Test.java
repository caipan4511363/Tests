/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   Administrator
 * Date:     2019/3/19 10:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.njupt.b14041408yyl.service;

import java.util.Random;

/**
 * @author caipan
 * @create 2019/3/19
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {90, 66, 55, 44, 53};
        Random random = new Random();
        for (int a = 0; a < arr.length ; a++) {
            int i = random.nextInt(arr.length - 1);
            System.out.println(arr[i]);
        }
    }
}
