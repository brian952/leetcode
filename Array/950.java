class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i<deck.length; i++)
        {
            queue.add(i);
        }
        int[] newDeck = new int[deck.length];
        for(int j : deck)
        {
            newDeck[queue.poll()] = j;
            if(!queue.isEmpty())
            {
                queue.add(queue.poll());
            }
        }
        return newDeck;
    }
}