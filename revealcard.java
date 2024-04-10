import java.util.*;

class revealcard {
    public int[] deckRevealedIncreasing(int[] deck) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        int n = deck.length;
        Arrays.sort(deck);
        d.addFirst(deck[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            d.addFirst(d.getLast());
            d.pollLast();
            d.addFirst(deck[i]);
        }
        for (int i = 0; i < n; i++) {
            deck[i] = d.pollFirst();
        }
        return deck;
    }
}