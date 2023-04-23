#include <queue>
#include <algorithm>
#include <iostream>

struct customer
{
    int t, d;
};

void queue_sort(std::queue<customer>& q)
{
    std::vector<customer> temp;
    while (!q.empty())
    {
        temp.push_back(q.front());
        q.pop();
    }

    std::sort(temp.begin(), temp.end(), [](const customer& a, const customer& b) { return a.t < b.t; });

    for (auto& c : temp)
        q.push(c);
}

int max_duration(std::queue<customer>& q)
{
    int max = 0;

    while (!q.empty())
    {
        max += q.front().d;
        q.pop();
    }

    return max;
}


int main()
{   
    int N, T, total_time = 0;

    std::cout << "Enter N(nombre de clients): ";
    std::cin >> N;

    std::cout << "Enter T(duree de la journee): ";
    std::cin >> T;

    std::queue<customer> q;

    for (int i = 0; i < N; i++)
    {
        customer c;
        std::cout << "Enter t(heure d'arrivee): ";
        std::cin >> c.t;
        std::cout << "Enter d(duree du service): ";
        std::cin >> c.d;
        q.push(c);
    }

    queue_sort(q);
    
    for (int i = 0; i < N; i++)
    {
        std::cout << "Client: " << i + 1 << ": arrive a " << q.front().t << " l'ordre de prendre: " << q.front().t + q.front().d << " temps reel: " << total_time + q.front().d << std::endl;
        total_time += q.front().d;
        q.pop();

    }

}