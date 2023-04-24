#include "viclist.h"
#include <string>
#include <fstream>

using std::cout;
using std::cin;

int main()
{
    vic::list<std::string> l1;
    vic::list<std::string> l2;

    std::ifstream in1("yourPath.in");
    std::ifstream in2("friendPath.in");

    std::string s;

    while (in1 >> s)
        l1.addLast(s);

    while (in2 >> s)
        l2.addLast(s);

    auto inter = vic::findIntersection(l1, l2);

    if (inter == "-1")
        cout << "No intersection found\n";
    else
        cout << "The intersection is: " << inter << "\n";

}