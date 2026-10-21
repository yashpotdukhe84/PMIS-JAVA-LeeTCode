    class Solution {
        public int distributeCandies(int[] candyType) {

            Set<Integer> uniqueTypes = new HashSet<>();

            for (int candy : candyType) {
               uniqueTypes.add(candy);
            }


             return Math.min(uniqueTypes.size(), candyType.length / 2);


            
        }
    }