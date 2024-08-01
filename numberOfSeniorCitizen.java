class numberOfSeniorCitizen{
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String i :details){
            int ageTens = i.charAt(11) - '0';
            int ageOnes =i.charAt(12) - '0';
            int age = ageTens * 10 + ageOnes;
            if(age>60)cnt++;
        }
        return cnt;
    }
}