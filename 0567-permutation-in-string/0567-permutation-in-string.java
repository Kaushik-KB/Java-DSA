class Solution { 
    public boolean checkInclusion(String s1, String s2) { 
        int n = s1.length(); 
        for (int i = 0; i <= s2.length() - n; i++) { 
            String sub = s2.substring(i, i + n); 
            int[] a = new int[26]; 
            int[] b = new int[26]; 
            // Count characters of s1 
            for (char c : s1.toCharArray()) { 
                a[c - 'a']++; 
                } 
            // Count characters of substring 
            for (char c : sub.toCharArray()) { 
                b[c - 'a']++; 
                } 
                 
                if (Arrays.equals(a, b)) { 
                    return true;
                     } 
                     } 
                     return false; 
                     } 
                     }