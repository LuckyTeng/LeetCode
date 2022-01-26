package src;

public class SolutionValidPalindrome {
    public boolean isPalindrome(String s) {
        String lc = s.toLowerCase();
        
        int n = lc.length();
        int left = 0;
        int right = n - 1;
        
        while ( left < right ) {
            while ( left < n ) {
                if ( isAlphaOrNumber(lc.charAt(left)) )
                    break;
                left++;
            }

            while ( right >= 0 ) {
                if ( isAlphaOrNumber(lc.charAt(right)))
                    break;
                right--;
            }

            if ( left != n && right != -1 && lc.charAt(left) != lc.charAt(right))
                return false;

            left++;
            right--;
        }
        
        return true;
    }
    
    private boolean isAlphaOrNumber( char c ) {
        if ( ( c >= 'a' && c <= 'z' )
           || ( c >= '0' && c <= '9'))
            return true;
        return false;
    }
}
