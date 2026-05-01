class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        char[] chars = s.toLowerCase().toCharArray();
        System.out.println("chars: " + Arrays.toString(chars));
        int i = 0, j = s.length() - 1;
        while(i <= j) {
            if(chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
