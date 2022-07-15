class Solution {
    public int countValidWords(String sentence) {
        var count = 0;
        
        var chars = sentence.toCharArray();
        
        var valid = true;
        var i = 0;
        var j = chars.length - 1;
        
        while(chars[i] == ' ' && i < chars.length) i++;
        while(chars[j] == ' ' && j > 0) j--;
        
        var hyphens = 0;
        var puncts = 0;
        
        while(i <= j) {
            
            if(chars[i] == ' ') {
                if(valid) count++;
                valid = true;
                hyphens = 0;
                puncts = 0;
                while(i <= j && chars[i] == ' ') i++;
            } else if(valid) {
                var c = chars[i];
                
               if(isLowerCased(c)) {
               	    i++;
                    continue;
                }
                if(c == '-' && hyphens == 0) {
                    hyphens++;
                    if(i > 0 && i < j) {
                        if(isLowerCased(chars[i-1]) && isLowerCased(chars[i+1])) {
                            i++;
                            continue;
                        } else {
                            valid = false;
                        }
                    } else {
                        valid = false;
                    }
                    i++;
                    continue;
                }
                if((c == ',' || c == '!' || c == '.') && puncts == 0 && ((i < j && chars[i+1] == ' ') || (i == j))) {
                    puncts++;
                    i++;
                    continue;
                    
                }
                valid = false; 
               i++;
            } else {
               i++;	
            }
        }
        
        if(valid) count++;
        
        return count;
    }
    
    private boolean isLowerCased(char c) {
        return c >= 'a' && c <= 'z';
    }
}