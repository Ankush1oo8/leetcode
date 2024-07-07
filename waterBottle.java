class waterBottle{
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank=numBottles;
        while(numBottles>=numExchange){
            int extra=numBottles%numExchange;
            int res=numBottles/numExchange;
            drank+=res;
            numBottles=res+extra;

        }
        return drank;
    }
}