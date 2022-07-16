class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // if(flowerbed.length == 1){
        //     if(flowerbed[0] == 0){
        //         if(n == 1){
        //             return true;
        //         }
        //     }
        // }
        // for(int i = 0; i< flowerbed.length; i++){
        //     if(n==0){
        //         break;
        //     }
        //     int num = flowerbed[i];
        //     if(num == 0){
        //         if(i == 0 || i == flowerbed.length-1){
        //             if((i == 0 && flowerbed[1] == 0) ||(i == flowerbed.length-1 && flowerbed[flowerbed.length-2] == 0)){
        //                 n--;
        //                 flowerbed[i] = 1;
        //             }
        //         }else{
        //             if(flowerbed[i-1] == 0 && flowerbed[i+1]==0){
        //                 n--;
        //                 flowerbed[i] = 1;
        //             }
        //         }
        //     }
        // }
        // return n==0;
        
        // ANOTHER APPROACH
        int sum = 0;
        for(int i = 0; i < flowerbed.length; ++ i) {
            int a, b, c;
            if(i == 0)
                a = 0;
            else
                a = flowerbed[i - 1];
            b = flowerbed[i];
            if(i == flowerbed.length - 1)
                c = 0;
            else
                c = flowerbed[i + 1];
            if(a + b + c == 0) {
                flowerbed[i] = 1;
                sum++;
            }
        }
        return sum >= n;
    }
}