public static int simpleArraySum(List<Integer> ar) {
int end=ar.size()-1;
    int sum=0;
    int start=0;
    
    while(start<end){
        
        sum+= ar.get(start)+ar.get(end);
        ++start;
        --end;
    }

return sum;
}

//using two pointer approach
// question link : https://www.hackerrank.com/challenges/simple-array-sum/problem
