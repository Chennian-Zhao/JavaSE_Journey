#include<iostream>
#include<algorithm>
#include<string>

using namespace std;

// 自定义比较函数
bool compare(const string& s1, const string& s2) {
    int count1 = 0, count2 = 0;

    // 如果两个字符串的长度不同，那么短的字符串应该排在前面
    if(s1.length() != s2.length())
        return s1.length() < s2.length();
    else {
        // 如果两个字符串的长度相同，那么我们需要计算每个字符串中1的数量

        // 计算s1中1的数量
        for(int i = 0; i < s1.length(); i++)
            if(s1[i] == '1')
                count1++; 

        // 计算s2中1的数量
        for(int i = 0; i < s2.length(); i++)
            if(s2[i] == '1')
                count2++; 

        // 如果1的数量不同，那么1的数量少的字符串应该排在前面
        if(count1 != count2)
            return count1 < count2;
        else
            // 如果1的数量也相同，那么我们按照字典序排序
            return s1 < s2;
    }
}

int main() {
    string inputStrings[100]; 
    int n; 
    // 首先输入一个整数n，表示字符串的个数
    cin >> n;
    // 根据n的值，读取n个字符串
    for(int i = 0; i < n; i++)
        cin >> inputStrings[i];
    // 使用自定义的比较函数对字符串进行排序
    sort(inputStrings, inputStrings + n, compare);
    // 输出排序后的字符串
    for(int i = 0; i < n; i++)
        cout << inputStrings[i] << endl;
    return 0;
}