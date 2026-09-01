class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0)
            return 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : stones) {
            pq.add(n);
        }

        while (pq.size() > 1) {
            int p1 = pq.remove();
            int p2 = pq.remove();

            if (p1 == p2) {
                continue;
            } else {
                int z = p1 - p2;
                pq.offer(z);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
