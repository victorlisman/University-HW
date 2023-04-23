#include <iostream>
#include <fstream>
#include <stack>
#include <array>

using std::cout;

struct sumdex
{
    int sum, index;
};

int main()
{
    std::ifstream in("data.in");

    int n;
    bool isFound = false;

    in >> n;

    std::array<std::array<int, 100>, 100> a;
    std::stack<sumdex> s;

    for (int i = 0; i < n; i++)
    {
        sumdex sum;
        sum.sum = 0;

        for (int j = 0; j < n; j++)
        {
            in >> a[i][j];
            sum.sum += a[i][j];
            sum.index = i;
        }
        s.push(sum);

    }
    

    while (!s.empty())
    {

        if (s.top().sum == 0 && isFound == false)
        {
            int sumaux = 0;

            for (int i = 0; i < n; i++)
                sumaux += a[i][s.top().index];
            
            if (sumaux == n - 1)
                cout << "homer e pe poz " << s.top().index << "\n";
            
            isFound = true;
        }

        s.pop();

    }

    if (isFound == false)
        cout << "nu exista" << "\n";


}