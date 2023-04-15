#include "viclist.h"

using std::cout;
using std::cin;

int main()
{
    vic::list<int> l1;
    vic::list<int> l2;

    l1.addLast(1);
    l1.addLast(2);
    l1.addLast(3);

    l2.addLast(2);
    l2.addLast(3);
    l2.addLast(4);

    vic::findIntersection(l1, l2);

}