public static long aVeryBigSum(List<Long> ar) {
        
        // i think we need to perform same operation as integer and in the place of interger we simply use long data type because given list is also has long values in this 
        
    // same two pointer approach again
        
        long sum=0;
        
        int start=0;
        int end=ar.size()-1;
        
        if((end+1)%2!=0){
            int mid=(start+end)/2;
            
            sum+= ar.get(mid);
        }
        
        while(start<end){
            
            sum+= ar.get(start)+ar.get(end);
        
        start++;
        end--;
        }

        
        return sum;
    }


//link :  https://www.hackerrank.com/challenges/a-very-big-sum/problem
