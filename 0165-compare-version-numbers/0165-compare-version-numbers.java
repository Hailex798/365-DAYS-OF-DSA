//OPTIMISED - 1(TWO-POINTERS: G PHT GYIII)

class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length(); int ct1 = 0;
        int len2 = version2.length(); int ct2 = 0;
        boolean flag1 = false; boolean flag2 = false;
        
        for(int i=0, j=0 ; i<len1 || j<len2 ; ){
            String a = ""; String b = "";
            if(ct1 == ct2){
                while(!flag1 && version1.charAt(i) != '.'){
                    a += version1.charAt(i++);
                    if(i == len1){
                        flag1 = true;
                        break;
                    }
                } i++;
                while(!flag2 && version2.charAt(j) != '.'){
                    b += version2.charAt(j++);
                    if(j == len2){
                        flag2 = true;
                        break;
                    }
                } j++;
                if(Integer.parseInt(a) < Integer.parseInt(b)) return -1;
                else if(Integer.parseInt(a) > Integer.parseInt(b)) return 1;
                else if(flag1 && flag2) return 0;
                if(flag1){
                    ct1++;
                } 
                if(flag2){
                    ct2++;
                }
            }else if(ct2 > ct1){
                while(!flag1 && version1.charAt(i) != '.'){
                    a += version1.charAt(i++);
                    if(i == len1){
                        flag1 = true;
                        break;
                    }
                } i++;
                if(Integer.parseInt(a) < 0) return -1;
                else if(Integer.parseInt(a) > 0) return 1;
                else if(flag1 && flag2) return 0;
            }else{
                while(!flag2 && version2.charAt(j) != '.'){
                    b += version2.charAt(j++);
                    if(j == len2){
                        flag2 = true;
                        break;
                    }
                } j++;
                if(0 < Integer.parseInt(b)) return -1;
                else if(0 > Integer.parseInt(b)) return 1;
                else if(flag1 && flag2) return 0;
            }
            ct1++; ct2++;
        }
        
        return 0;
    }
}