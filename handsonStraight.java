class handonStraight{
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> cardCounts = new HashMap<>();
          for (int card : hand) {
              cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
          }
        
         Arrays.sort(hand);
        
          for (int card : hand) {
               if (cardCounts.containsKey(card)) {
                 for (int currentCard = card; currentCard < card + groupSize; ++currentCard) {
                     if (!cardCounts.containsKey(currentCard)) {
                          return false;
                      }
                     cardCounts.put(currentCard, cardCounts.get(currentCard) - 1);
                      if (cardCounts.get(currentCard) == 0) {
                          cardCounts.remove(currentCard);
                      }
                  }
              }
          }
        
          
          return true;   
      }
}