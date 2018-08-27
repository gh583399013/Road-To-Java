package test003;

/**
 * @author mask
 * @date 2018/8/24 10:06
 * @desc
 */
public class ChooseSort {
    public static void maopaoSort(int... numArr){
        System.out.print("输入顺序:");
        for (int i : numArr) {
            System.out.print(i + "|");
        }
        System.out.println();
        for (int i=0;i < numArr.length -1;i++){

            int waitSwap = i;
            for(int j=i; j < numArr.length -1;j++){
                if(numArr[j] < numArr[j+1]){
                    waitSwap = j+1;
                }
            }

            if(i != waitSwap){
                int tmp = numArr[i];
                numArr[i] = numArr[waitSwap];
                numArr[waitSwap] = tmp;
            }
        }

        System.out.print("输出顺序:");
        for (int i : numArr) {
            System.out.print(i + "|");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ChooseSort.maopaoSort(new int[]{2,1,3,5,4});
    }
}
