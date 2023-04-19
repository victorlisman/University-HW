#include <stack>
#include <iostream>

using std::cin;
using std::cout;

bool isNull(int a[], int n)
{
    for (int i = 0; i < n; i++)
        if (a[i] != 0)
            return false;
    return true;
}


int main()
{
    int n, cnt = 0;
    std::stack<int*> s;
    
    cin >> n;

    int a[100][100];

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
            cin >> a[i][j];

        s.push(a[i]);
    }

    while (!s.empty())
    {
        int *i = s.top();
        cnt++;
        s.pop();

        if (isNull(i, n))
        {
            cout << "homer here, id: " << cnt - 1;
            break;
        }
        
    }
    

}