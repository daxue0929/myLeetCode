package xiaoxue;

/**
 * @author daxue0929
 * @date 2021/03/01
 **/
public class NumArrayTest {
    public static void main(String[] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

    }

}

// 经典的前缀和
// 分解为前缀和之差
class NumArray {
    int[] array;
    public NumArray(int[] nums) {
        array = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            array[i + 1] = array[i] + nums[i];
        }

    }
    public int sumRange(int i, int j) {
        return array[j + 1] - array[i];
    }
}
