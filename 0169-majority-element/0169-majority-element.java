class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int num : nums) {

            // If number already exists, increase count
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } 
            // If not, put it with count 1
            else {
                map.put(num, 1);
            }

            // Check if it became majority
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // this line won't actually be needed as per problem
    
        
    }
}