package test002;

/**
 * @author mask
 * @date 2018/8/24 10:06
 * @desc
 */
public class MaopaoSort {
    public static void maopaoSort(int... numArr){
        System.out.print("输入顺序:");
        for (int i : numArr) {
            System.out.print(i + "|");
        }
        System.out.println();
        for (int i=0;i < numArr.length -1;i++){
            for(int j=0; j < numArr.length - i -1;j++){
                if(numArr[j] >= numArr[j+1]){
                    int temp = numArr[j+1];
                    numArr[j+1] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }

        System.out.print("输出顺序:");
        for (int i : numArr) {
            System.out.print(i + "|");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaopaoSort.maopaoSort(new int[]{2,1,3,5,4});
    }
}
