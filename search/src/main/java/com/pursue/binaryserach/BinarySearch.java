package com.pursue.binaryserach;

/**
 * Created by pursue on 6/20/21
 * Describe:二分查找
 */
public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        return search(arr,0,arr.length-1,target);
    }

    /**1、二分查找的前提是数组是有序的（已经排过序了）
     * 2、找到区间中间的元素mid做判断，如果target比mid大，说明在mid的右边，就需要在（mid+1，r）中查找，
     * 反之在（l,mid-1）中查找，相等的话需要考虑重复的问题，递归查找
     * 3、时间复杂度是 O(logn),是已2为底
     * @param arr
     * @param l
     * @param r
     * @param target
     * @return
     */
    private static int search(int[] arr, int l, int r, int target){
        if (l>r) return -1;
        int mid = l+(r-l)/2;
        if (arr[mid] > target){
            return search(arr,l,mid-1,target);
        }else if (arr[mid] < target){
            return search(arr,mid+1,r,target);
        }else{//相等的情况下考虑有重复的数据
            while (mid>0 && arr[mid] == arr[mid-1]) mid--;
            return mid;

        }
    }
}
