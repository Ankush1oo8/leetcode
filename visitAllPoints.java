public class visitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=1;i<points.length;i++){
            int preX=points[i-1][0];
            int preY=points[i-1][1];

            int curX=points[i][0];
            int curY=points[i][1];

            int dx=Math.abs(curX-preX);
             int dy=Math.abs(curY-preY);

             time+=Math.max(dy,dx);

        }
        return time;
    }
}
