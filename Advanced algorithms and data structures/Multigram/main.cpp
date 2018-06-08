#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <stdio.h>

using namespace std;


vector<int> getAllDividers(int ofNumber)
{
    vector<int> dividers;
    for (int i = 2; i < ofNumber; ++i)
    {
        if (ofNumber % i ==0)
        {
            dividers.push_back(i);
        }
    }

    return dividers;
}

bool isAnagramOf(string root, string toCompare)
{
    sort (root.begin(), root.end());
    sort (toCompare.begin(), toCompare.end());

    return root==toCompare;
}

int main()
{
    string multigram;
    cin>>multigram;

    bool all_same = multigram.find_first_not_of(multigram[0]) == string::npos;

    if (all_same)
    {
        cout << multigram[0];
        return 0;
    }

    int len=multigram.length();
    vector<int> dividers = getAllDividers(len);

    if (dividers.size() ==0)
    {
        cout << -1 << endl;
        return 0;
    }

    reverse(dividers.begin(), dividers.end());

    for(int j=0; j <dividers.size(); j++)
    {
        int substr_size = len/dividers[j];
        int parts = dividers[j];

        string firstPart = multigram.substr(0, substr_size);
        bool isMultigram = true;
        for(int i = 1; i < parts ; i++)
        {
            string nextPart = multigram.substr(i*substr_size, substr_size);

            //cout << "Compare: " << firstPart <<" vs " << nextPart << endl;
            if(isAnagramOf(firstPart, nextPart) == false)
            {
                isMultigram = false;
                break;
            }
        }
        if(isMultigram)
        {
            cout << firstPart << endl;
            return 0;
        }

    }

    cout << -1 << endl;


    return 0;
}
