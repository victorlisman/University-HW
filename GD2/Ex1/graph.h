#include <iostream>
#include <vector>
#include <stack>

class Graph
{
private:
    int num_nodes;
    std::vector<std::vector<int>> adj_matrix;
    std::vector<char> nodes;

public:
    Graph(int num_nodes) : num_nodes(num_nodes), adj_matrix(num_nodes, std::vector<int>(num_nodes, 0)), nodes(num_nodes) {}

    void addEdge(char src, char dest)
    {
        int src_index = getIndex(src);
        int dest_index = getIndex(dest);
        adj_matrix[src_index][dest_index] = 1;
    }

    void addNode(char node)
    {
        nodes.push_back(node);
        num_nodes++;
        adj_matrix.resize(num_nodes, std::vector<int>(num_nodes, 0));
        for (int i = 0; i < num_nodes - 1; i++)
        {
            adj_matrix[i].resize(num_nodes, 0);
        }
    }

    int getIndex(char node)
    {
        for (int i = 0; i < num_nodes; i++)
        {
            if (nodes[i] == node)
            {
                return i;
            }
        }
        return -1;
    }

    void topologicalSortUtil(int node, std::vector<bool> &visited, std::stack<char> &st)
    {
        visited[node] = true;
        for (int i = 0; i < num_nodes; i++)
        {
            if (adj_matrix[node][i] && !visited[i])
            {
                topologicalSortUtil(i, visited, st);
            }
        }
        st.push(nodes[node]);
    }

    std::vector<char> topologicalSort()
    {
        std::vector<bool> visited(num_nodes, false);
        std::stack<char> st;
        std::vector<char> sorted;

        for (int i = 0; i < num_nodes; i++)
        {
            if (!visited[i])
            {
                topologicalSortUtil(i, visited, st);
            }
        }
        while (!st.empty())
        {
            sorted.push_back(st.top());
            st.pop();
        }
        return sorted;
    }

    void print()
    {
        for (int i = 0; i < num_nodes; i++)
        {
            std::cout << nodes[i] << " ";
            for (int j = 0; j < num_nodes; j++)
            {
                std::cout << adj_matrix[i][j] << " ";
            }
            std::cout << std::endl;
        }
    }
};