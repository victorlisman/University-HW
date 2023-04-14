#include <iostream>

template<typename T>
class list
{
private:
    struct node
    {
        T m_data;
        node* m_next;
        node* m_prev;
    };

    node* m_head;
    node* m_tail;
    size_t m_size;

public:
    list(): m_size(0), m_head(nullptr), m_tail(nullptr) {}

    

}