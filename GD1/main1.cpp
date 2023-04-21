#include <iostream>
#include <stack>
#include <array>

using std::cin;
using std::cout;

struct sums
{
    int s1, s2;
};

int main()
{
    int n;

    cin >> n;

    std::array<std::array<int, 100>, 100> a;
    std::stack<sums> s;

    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> a[i][j];

    for (int i = 0; i < n; i++)
    {
        sums sum;
        sum.s1 = 0;
        sum.s2 = 0;

        for (int j = 0; j < n; j++)
        {
            sum.s1 += a[j][i];
            sum.s2 += a[i][j];
        }

        s.push(sum);

    } 

    int cnt = 1;

    while (!s.empty())
    {

        if (s.top().s1 == n - 1 && s.top().s2 == 0)
            cout << "mustariu e aici pe poz " << cnt << "\n";

        cout << s.top().s1 << " " << s.top().s2 << "\n";
        s.pop();

        cnt++;
    }


}