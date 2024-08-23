import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElementsInList {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap  =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>2){
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = minHeap.poll().getKey();
        }

        return res;
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{1,2,2,3,3,3}, 2);
    }
}
