#include <bits/stdc++.h>
using namespace std;

int solve(vector<int> &nums){
    int left = 0;
    int right = nums.size();
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == -1) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return right+1;
}

int main(){
    vector<int> nums = {-1, -1, -1, -1};
    cout<<solve(nums);
}
