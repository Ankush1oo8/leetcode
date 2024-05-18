class pascalTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            List<Integer>temp=new ArrayList<>();
            for(int col=1;col<=row;col++){
                temp.add((int)nCr(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;
    }
    public static long nCr(int r,int c){
        long res=1;
        for(int i=0;i<c;i++){
            res*=(r-i);
            res=res/(i+1);
        }
        return res;
    }
}