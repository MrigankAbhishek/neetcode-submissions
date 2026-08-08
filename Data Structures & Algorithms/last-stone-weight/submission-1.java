class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> smash = new PriorityQueue<>();
        for(int stone : stones){
            smash.offer(-stone);
        }
        while(smash.size()>1){
            int x=smash.poll();
            int y=smash.poll();
            if(y>x){
                smash.offer(x-y);
            }
        }

        smash.offer(0);
        return Math.abs(smash.peek());
    }
}
