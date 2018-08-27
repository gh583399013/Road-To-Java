package test001;

public class QuickSortPro {
	/**
	 *
	 * @param arr 待排序数组
	 * @param start 待排序区间起始值
	 * @param end   待排序区间结束值
	 */
	public static void quickSort(int[] arr, int start, int end){
		if(start >= end){
			return ;
		}

		//左边游标
		int left = start;
		//右边游标
		int right = end;

		//基准数每次取第一个数
		int baseIndex = start;
		int baseIndexNum = arr[baseIndex];

		while(left < right){
			//先从右向左  原因: https://blog.csdn.net/w282529350/article/details/50982650

			//思考 这里的>= =号能不能去掉
			//不能去掉 举个例子{6,6},  如果去掉了=好 left 和 right值不会变更 left < right 恒成立 造成下面的交换 本来是可以避免的
			while(arr[right] >= baseIndexNum && left < right){
				right--;
			}
			while(arr[left] <= baseIndexNum && left < right){
				left++;
			}

			//如果左右 还没对碰 交换值(就是再碰头之前,把大于基准数 和  小于基准数的  分开来  碰头之后,  一左一右 要么比记住数大 要么比基准数小)
			if(left < right){
				int swapNum = arr[right];
				arr[right] = arr[left];
				arr[left] = swapNum;
			}
		}
		//碰头了  把基准数的值 交换到分界线

		//这里有优化空间  比如{0,1}本身就是排序好的 此时left == right == 0 就没有必要交换了
		if(baseIndex != left){
			System.out.println("####");
			int swapNum = arr[left];
			arr[left] = arr[baseIndex];
			arr[baseIndex] = swapNum;
		}

		//以分界线左右 重复此过程  直到left == right == 0;   比如左边是{0,1}  经历此过程之后  left == right == 0
		quickSort(arr, start, left -1);
		quickSort(arr, left + 1, end);
	}
	
	public static void main(String[] args) {
		//打印1次 ####
		int[] arr = {6,2,1,7,9};
		QuickSortPro.quickSort(arr, 0, arr.length-1);

		//打印2次 ####
		int[] arr1 = {6,1,2,7,9};
		QuickSortPro.quickSort(arr1, 0, arr1.length-1);

		for(int a: arr){
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("#############################");

		for(int a: arr1){
			System.out.print(a + " ");
		}

	}
}
