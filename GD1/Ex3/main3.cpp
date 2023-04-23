#include "viclist.h"
#include <string>

using std::cout;
using std::cin;

int main()
{
    vic::list<std::string> l1;
    vic::list<std::string> l2;


    l1.addFirst("Rome");
    l1.addFirst("Aquileia");
    l1.addFirst("Sarmizegetusa");
    l1.addFirst("Tomis");
    l1.addFirst("Athens");
    l1.addFirst("Alexandria");


    l2.addFirst("a");
    l2.addFirst("sa");
    l2.addFirst("ss");
    l2.addFirst("Nsssa");



    auto inter = vic::findIntersection(l1, l2);

    cout << "Intersection: " << inter;

}