 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    
    
    int alice=0;
    int bob=0;
    
    List <Integer> ans =new ArrayList<Integer>();
    
    for(int i=0;i<a.size();i++){
        
        if(a.get(i)>b.get(i)){
            alice++;
        }
        else if(a.get(i)<b.get(i)){
            bob++;
        }
       
    }

        ans.add(alice);
        ans.add(bob);
        
    return ans;
    }

}

// Question link : https://www.hackerrank.com/challenges/compare-the-triplets/problem
