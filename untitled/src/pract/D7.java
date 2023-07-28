package pract;

import java.util.*;

/**
 * 打印任务顺序
 */
public class D7 {
    public static void queue(Integer[] array){
        //原数组 9 5 7
        //任务 顺序  1 3 2
        //使用Map存储原数组内容，和下标
        HashMap<Integer,Integer> priorityQ = new HashMap<>();
        LinkedHashMap<Integer,Integer> LinkedPriorityQ = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            priorityQ.put(array[i],i);//下标和值一起存入其中
            LinkedPriorityQ.put(array[i],i);
        }
        List<Map.Entry<Integer,Integer>> nodeList = new ArrayList<Map.Entry<Integer, Integer>>(priorityQ.entrySet());
        Collections.sort(nodeList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });
        for (Map.Entry<Integer, Integer> integerIntegerEntry : nodeList) {
            System.out.println(integerIntegerEntry.getValue());
        }
    }

    public static void main(String[] args) {
        Integer[] li = {9,5,7};

        D7.queue(li);
    }
}
