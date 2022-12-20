int majorityElement(int* nums, int numsSize){
    int voter=nums[0],voteCount=1;
    for(int i=1;i<numsSize;i++){
        if(voter==nums[i])++voteCount;
        else --voteCount;
        if(voteCount==0){
            voter=nums[i];
            voteCount=1;
        }
    }
    return voter;

}
