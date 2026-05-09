package 数组中的第K个最大元素;

public class Solution3 {
   //大顶堆的构建过程就是从最后一个非叶子结点开始从下往上调整   最后一个非叶子节点的索引为n/2-1
    /*
    构建大顶堆过程
    1.从最后一个非叶子结点开始从下往上调整
    2.左子树大于右子树，则交换
    3.右子树大于父节点，则交换
    4.交换之后，继续调整
    * */

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void buildMaxHeap(int[] nums, int heapSize) {
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            heapify(nums, i, heapSize);
        }
    }

    private void heapify(int[] nums, int i, int heapSize) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;
        if (left < heapSize && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < heapSize && nums[right] > nums[largest]) {
            largest = right;
        }
        if(largest != i){
            swap(nums,i,largest);
            heapify(nums,largest,heapSize);
        }
    }
    public int findKthLargest(int[] nums, int k){
        // 2. 进行 k-1 次交换和堆化
        for (int i = nums.length - 1; i >= nums.length - k + 1; i--) {
            swap(nums, 0, i);        // 将堆顶放到数组末尾
            heapify(nums, 0, i);     // 对剩余部分堆化
        }

        // 3. 堆顶就是第 k 大元素
        return nums[0];

    }
}
