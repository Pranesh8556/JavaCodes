class Solution {
    public boolean isHappy(int n) {
        int temp=n; //19
        int digit=0;
        int square;
            while(temp!=1 &&temp!=4){
                int sum=0;
        while(temp>0){
            digit=temp%10; //9
            square=digit*digit; //81
            sum=sum+square; //81
            temp=temp/10; //1
        } //82
        temp=sum; //82
    }
    if(temp==1)
    return true;
    else
    return false;

    }
}