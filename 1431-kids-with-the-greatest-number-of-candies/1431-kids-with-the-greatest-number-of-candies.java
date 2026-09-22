class Solution { 
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { 
        List<Boolean> ans = new ArrayList<>(); 
// Find maximum 
int max = candies[0]; 
for (int i = 1; i < candies.length; i++) {
     if (candies[i] > max) { 
        max = candies[i]; 
        } 
        } 
        // Check each kid 
        for (int i = 0; i < candies.length; i++) { 
            if (candies[i] + extraCandies >= max) {
                 ans.add(true); 
                 }
                  else {
                     ans.add(false); 
                     } 
                     } 
                     return ans; 
                     } 
                     }