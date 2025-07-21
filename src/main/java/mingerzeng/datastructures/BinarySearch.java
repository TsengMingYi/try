package mingerzeng.datastructures;

public class BinarySearch {

    private BinarySearch(){}

    protected static<E extends Comparable<E>> int binarySearch(E arr[], int n, E target){
        int l = 0, r = n - 1; // 在[l...r]的範圍裡尋找target
        while (l <= r){ // 當 l == r時，區間[l...r]依然是有效的
            int mid = l + (r-l) / 2;
//            int mid = (l + r) / 2;
            if( arr[mid] == target){
                return mid;
            }
            if(target.compareTo(arr[mid]) > 0){
                l = mid + 1; // target在[mid+1...r]中
            }else{ // target < arr[mid]
                r = mid - 1; // target在[l...mid-1]中
            }
        }
        return l;
    }
}
