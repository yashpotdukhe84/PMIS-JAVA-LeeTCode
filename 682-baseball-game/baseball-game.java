class Solution {
    public int calPoints(String[] operations) {
 
        List<Integer> lst = new ArrayList<>();
        int i = -1;
        for(String s : operations){
            String temp = s;
            if(s.equals("+")){
                int x = lst.get(i) + lst.get(i-1);
                lst.add(x);
                i++;
            }
            else if(s.equals("D")){
                int x = 2 * lst.get(i);
                lst.add(x);
                i++;
            }
            else if(s.equals("C")){
                lst.remove(i);
                i--;
            }
            else{
                int a = Integer.parseInt(s);
                lst.add(a);
                i++;
            }
        }

        int sum = 0;
        for(int j = 0 ; j<lst.size(); j++){
            sum += lst.get(j);
        }
        return sum;
    }
}