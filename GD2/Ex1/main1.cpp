#include <iostream>
#include <vector>
#include <fstream>
#include <algorithm>
#include <array>
#include <string>
#include "graph.h"

int main()
{
    Graph graph(0);
    std::string word;
    std::vector<std::string> words;
    std::vector<char> alphabet;
    std::ifstream in("index.in");
    std::ofstream out("index.out");

    in >> word;

    while (word != ".")
    {
        words.push_back(word);

        for (int i = 0; i < word.length(); i++)
            if (std::find(alphabet.begin(), alphabet.end(), word[i]) == alphabet.end())
                alphabet.push_back(word[i]);

        in >> word;
    }

    in.close();

    for (auto i : alphabet)
        graph.addNode(i);

    for (int i = 0; i < words.size() - 1; i++)
    {
        const std::string &word1 = words[i];
        const std::string &word2 = words[i + 1];    
    

        int minLength = std::min(word1.length(), word2.length());

        for (int j = 0; j < minLength; j++)
        {
            char ch1 = word1[j];
            char ch2 = word2[j];

            if (ch1 != ch2)
                graph.addEdge(ch1, ch2);
        }


    }

    in.close(); 

    graph.print();

    std::vector<char> sorted = graph.topologicalSort();

    for (auto i : sorted)
        out << i;
}
