#include<iostream>
#include<algorithm>

using namespace std;

// 自定义比较函数
bool compare(int a, int b) {
    // 奇数在前，偶数在后
    if (a % 2 != b % 2) {
        return a % 2 > b % 2;
    }
    // 奇数按从大到小排序
    if (a % 2 == 1) {
        return a > b;
    }
    // 偶数按从小到大排序
    return a < b;
}

int main() {
    int nums[10];

    for (int i = 0; i < 10; ++i) {
        cin >> nums[i];
    }
    // 使用自定义的比较函数对整数进行排序
    sort(nums, nums + 10, compare);
    // 输出排序后的整数
    for (int i = 0; i < 10; ++i) {
        cout << nums[i] << " ";
    }
    return 0;
}