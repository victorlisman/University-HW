#include <iostream>
#include <array>

namespace vic {
template<typename T>
struct node
{
    T m_info;
    node<T>* m_next;
    node<T>* m_prev;

    bool operator==(const node<T>& other) const
    {
        return m_info == other.m_info;
    }
};

template<typename T>
class list
{
private:
    node<T>* m_head;
    node<T>* m_tail;
    size_t m_size;

public:
    list(): m_size(0), m_head(nullptr), m_tail(nullptr) {}

    ~list()
    {
        while (m_head != nullptr)
        {
            node<T>* aux = m_head;
            m_head = m_head->m_next;
            delete aux;
        }
    }

    void addFirst(T x)
    {

        node<T> *aux = new node<T>;

        aux->m_info = x;
        aux->m_prev = NULL;
        aux->m_next = m_tail;

        if (m_tail != NULL)
            m_tail->m_prev = aux;

        m_tail = aux; 

        
        if (m_head == NULL)
            m_head = m_tail;

        m_size++;
    }

    void addLast(T x)
    {

        node<T> *aux = new node<T>;

        aux->m_info = x;
        aux->m_prev = m_head;
        aux->m_next = NULL;

        if (m_tail != NULL)
            m_tail->m_next = aux;

        m_tail = aux;

        if (m_tail == NULL)
            m_tail = m_head;

        m_size++;
    }

    T getInfo (node<T>* p)
    {
        return p->m_info;
    }

    void removeFirst()
    {
        node<T>* aux;

        if (m_tail != NULL)
        {
            aux = m_tail->m_next;

            if (m_tail == m_head)
                m_head = NULL;

            delete m_tail;

            m_tail = aux;

            if (m_tail != NULL)
                m_tail->m_prev = NULL;

            m_size--;
        }
        else throw "The list is empty";
    }

    void removeLast()
    {
        node<T> *aux;

        if (m_head != NULL)
        {
            aux = m_head->m_prev;

            if (m_tail == m_head)
                m_tail = NULL;

            delete m_head;

            m_head = aux;
            if (m_head != NULL)
                m_head->m_next = NULL;

            m_size--;
        }
        else throw "The list is empty";
    }

    
    node<T>* findFirstOccurrence(T x)
    {

        node<T> *aux;

        aux = m_tail;

        while (aux != NULL)
        {
            if (aux->m_info == x)
                return aux;
            aux = aux->m_next;
        }
        return NULL;
    }

    node<T>* findLastOccurrence(T x)
    {
        node<T> *aux;

        aux = m_head;
        while (aux != NULL) {
            if (aux->m_info == x)
                return aux;
            aux = aux->m_prev;
        }

        return NULL;
    }

    void removeFirstOccurrence(T x)
    {
        node<T> *px;

        px = findFirstOccurrence(x); 

        if (px != NULL)
        {
            if (px->m_prev != NULL)
                px->m_prev->m_next = px->m_next;

            if (px->m_next != NULL)
                px->m_next->m_prev = px->m_prev;

            if (px->m_prev == NULL)
                m_tail = px->m_next;

            if (px->m_next == NULL)
                m_head = px->m_prev;

            delete px;
        }
    }

    void removeLastOccurrence(T x)
    {

        node<T> *px;

        px = findLastOccurrence(x);

        if (px != NULL)
        {
            if (px->m_prev != NULL)
                px->m_prev->m_next = px->m_next;

            if (px->m_next != NULL)
                px->m_next->m_prev = px->m_prev;

            if (px->m_prev == NULL)
                m_tail = px->m_next;

            if (px->m_next == NULL)
                m_head = px->m_prev;

            delete px;
        }
    }

    list<T>& operator=(const list<T>& l)
    {
        node<T> *aux;

        if (this != &l)
        {
            while (m_tail != NULL)
                removeFirst();

            aux = l.m_tail;

            while (aux != NULL)
            {
                addLast(aux->m_info);
                aux = aux->m_next;
            }
        }
        return *this;
    }

    bool isEmpty()
    {
        return m_tail == NULL;
    }

    size_t size()
    {
        return m_size;
    }

    void print()
    {
        node<T> *aux;

        aux = m_tail;

        while (aux != NULL)
        {
            std::cout << aux->m_info << " ";
            aux = aux->m_next;
        }
        std::cout << std::endl;
    }

    node<T>* begin()
    {
        return m_tail;
    }

    node<T>* end()
    {
        return NULL;
    }

    class iterator
    {
    private:
        node<T>* m_ptr;

    public:
        iterator(node<T>* ptr = NULL): m_ptr(ptr) {}

        iterator& operator++()
        {
            m_ptr = m_ptr->m_next;
            return *this;
        }

        iterator& operator--()
        {
            m_ptr = m_ptr->m_prev;
            return *this;
        }

        T& operator*()
        {
            return m_ptr->m_info;
        }

        bool operator==(const iterator& it)
        {
            return m_ptr == it.m_ptr;
        }

        bool operator!=(const iterator& it)
        {
            return m_ptr != it.m_ptr;
        }
    };


};

template<typename T>
void findIntersection(list<T> &l1, list<T> &l2)
{
    for (auto it : l1)
    {
        if (l2.findFirstOccurrence(it) != NULL)
            std::cout << it << " ";
    }
}
}