#include <queue>
#include <algorithm>
#include <iostream>
#include <fstream>

using std::cout;

struct customer
{
    int t, d;
};

int main()
{   
    std::ifstream in("data.in");

    int N, T, total_time = 0, max_time = 0;
    bool notServed = false;

    in >> N;
    in >> T;

    std::queue<customer> q;

    for (int i = 0; i < N; i++)
    {
        customer c;
        in >> c.t;
        in >> c.d;
        q.push(c);
    }

    int cnt = 1;

    while (!q.empty())
    {
        customer c = q.front();
        q.pop();

        if (total_time < c.t)
        {
            cout << "Attende de" << total_time << " a " << c.t << "\n";
            total_time = c.t;

        }

        max_time += c.d;

        total_time += c.d;

        if (c.d + c.t > T || total_time > T)
            cout << "Le client: " << cnt++ << " n'a pas ete servi\n";
        else
        {
            cout << "Le client " << cnt++ <<  ": s'attendait a etre servi a " << c.t + c.d << " heures mais l'a ete a " << total_time << "\n";
            notServed = true;
        }

    }

    if (!notServed)
        cout << "Tous les clients servis!\n";
    else
        cout << "Certains clients ne sont pas servis!\n";

    cout << "Duree totale des commandes: " << total_time << "\n";
    cout << "Duree maximale des commandes: " << max_time << "\n";


}