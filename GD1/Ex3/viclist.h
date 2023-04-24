#include <iostream>

using std::cout;
using std::cin;

namespace vic {
template <typename T>
struct node
{
    T data;
    node<T> *next;

    bool operator==(const node<T> &other)
    {
        return data == other.data;
    }
};

template <typename T>
class list
{
private:
    node<T> *m_tail;
    node<T> *m_head;

public:
    list()
    {
        m_tail = NULL;
        m_head = NULL;
    }

    int size()
    {
        int count = 0;
        node<T> *aux = m_tail;

        while (aux != NULL)
        {
            count++;
            aux = aux->next;
        }

        return count;
    }

    void addFirst(T x)
    {
        node<T> *aux = new node<T>;

        aux->data = x;
        aux->next = m_tail;
        m_tail = aux;
    }

    void addLast(T x)
    {
        node<T> *aux = new node<T>;

        aux->data = x;
        aux->next = NULL;

        if (m_tail == NULL)
            m_tail = aux;
        else
        {
            node<T> *aux2 = m_tail;

            while (aux2->next != NULL)
                aux2 = aux2->next;

            aux2->next = aux;
        }
    }

    void insert(T x, int pos)
    {
        node<T> *aux = new node<T>;

        aux->data = x;
        aux->next = NULL;

        if (pos == 0)
        {
            aux->next = m_tail;
            m_tail = aux;
        }
        else
        {
            node<T> *aux2 = m_tail;

            for (int i = 0; i < pos - 1; i++)
                aux2 = aux2->next;

            aux->next = aux2->next;
            aux2->next = aux;
        }
    }

    void print()
    {
        node<T> *aux = m_tail;

        while (aux != NULL)
        {
            cout << aux->data << " ";
            aux = aux->next;
        }
        cout << "\n";
    }

    node<T> *begin()
    {
        return m_tail;
    }

    node<T> *end()
    {
        return NULL;
    }
};


template <typename T>
T findIntersection(list<T> &l1, list<T> &l2)
{
    for (auto i = l1.begin(); i != l1.end(); i = i->next)
        for (auto j = l2.begin(); j != l2.end(); j = j->next)
        {
            if (*i == *j)
                return i->data;

        }

    return "-1";
}
}