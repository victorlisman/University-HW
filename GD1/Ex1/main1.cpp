#include <iostream>
#include <vector>
#include <stack>
#include <fstream>

using std::cout;

int findHomer(std::vector<std::vector<int>>& m) 
{
    int n = m.size();
    std::stack<int> st;

    for (int i = 0; i < n; i++) 
        st.push(i);

    while (st.size() > 1) 
    {
        int person1 = st.top();
        st.pop();

        int person2 = st.top();
        st.pop();

        if (m[person1][person2] == 1) 
            st.push(person2);
        else
            st.push(person1);
    }

    int potHomer = st.top();

    for (int i = 0; i < n; i++) 
    {
        if (i == potHomer) 
            continue;

        if (m[potHomer][i] == 1 || m[i][potHomer] == 0) 
            return -1;
    }

    return potHomer;
}

int main() 
{
    std::vector<std::vector<int>> m;
    std::ifstream in("data.in");

    int n;
    in >> n;

    m.resize(n);

    for (int i = 0; i < n; i++) 
    {
        m[i].resize(n);

        for (int j = 0; j < n; j++) 
            in >> m[i][j];
    }

    int answer = findHomer(m);

    if (answer == -1) 
        cout << "Homer est absente." << "\n";
    else 
        cout << "Homer est dans le position " << answer << "." << "\n";
}