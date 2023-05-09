#include <iostream>
#include <list>
#include <stack>
 
template<typename T>
class Graph {
private:
    int V;
    std::list<T>* adj;
 
    void topologicalSortUtil(int v, bool visited[], std::stack<T>& Stack);
 
public:
    Graph(int V);
 
    void addEdge(T v, T w);
    void topologicalSort();
};

template<typename T>
Graph<T>::Graph(int V)
{
    this->V = V;
    adj = new std::list<T>[V];
}

template<typename T>
void Graph<T>::addEdge(T v, T w)
{
    adj[v].push_back(w);
}

template<typename T>
void Graph<T>::topologicalSortUtil(int v, bool visited[], std::stack<T>& Stack)
{
    visited[v] = true;
 
    list<T>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            topologicalSortUtil(*i, visited, Stack);
 
    Stack.push(v);
}
 

template<typename T>
void Graph<T>::topologicalSort()
{
    std::stack<T> Stack;
 
    bool* visited = new bool[V];
    for (int i = 0; i < V; i++)
        visited[i] = false;
 
    for (int i = 0; i < V; i++)
        if (visited[i] == false)
            topologicalSortUtil(i, visited, Stack);
 
    while (Stack.empty() == false) {
        cout << Stack.top() << " ";
        Stack.pop();
    }
}