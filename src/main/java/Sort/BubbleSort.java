package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    //생성자 방식과 아래 메소드 방식의 차이ㅓ
    public BubbleSort(ArrayList<Integer> dataList) {
        // 반복횟수 = list size - 1
        for(int x = 0; x < dataList.size() - 1; x++){
            boolean swap = false;
            //앞뒤로 비교하면서 큰수가 뒤로감
            for(int y = 0; y < dataList.size() - 1 - x; y++){
                if(dataList.get(y) > dataList.get(y + 1)){
                    Collections.swap(dataList, y, y+1);
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
        System.out.println(dataList);
    }

    public ArrayList<Integer> BubbleSort(ArrayList<Integer> dataList){
        // 반복횟수 = list size - 1
        for(int x = 0; x < dataList.size() - 1; x++){
            boolean swap = false;
            //앞뒤로 비교하면서 큰수가 뒤로감
            for(int y = 0; y < dataList.size() - 1 - x; y++){
                if(dataList.get(y) > dataList.get(y + 1)){
                    Collections.swap(dataList, y, y+1);
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
        return dataList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(3);
        data.add(5);
        data.add(6);
        data.add(9);
        new BubbleSort(data);
    }
}
