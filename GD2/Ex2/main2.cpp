#include <iostream>
#include <string>
#include <array>
#include "QuadTree.h"

int main()
{
    while (true)
    {
        std::string s, s2;
        int index = 0;
        s = "ppwwwbpbbwwbw";
        s2 = "pwbwpwwbw";
        Node *root = Node::buildTree(s, index, 1024);
        index = 0;
        Node *root2 = Node::buildTree(s2, index, 1024);
        index = 0;
        Node *root3 = Node::overlay(root, root2, index);

    ULTRASTART:
        std::cout << "Selectati 1 pentru preorder predefinite sau 2 pentru preorder custom: sau 3 pentru a iesi\n";
        int option;
        std::cin >> option;

        switch (option)
        {
        case 1:
        start:
            char option2;
            std::cout << "Selectati:\n a pentru a afisa preorder-ul\n b pentru numarul de pixeli\nc pentru a iesi:\n";
            std::cin >> option2;

            switch (option2)
            {
            case 'a':
                std::cout << "Preorder-ul 1: ";
                root->printTree();
                std::cout << std::endl;
                std::cout << "Preorder-ul 2: ";
                root2->printTree();
                std::cout << std::endl;
                std::cout << "Preorder-ul 3: ";
                root3->printTree();
                std::cout << std::endl;
                goto start;
            case 'b':
                std::cout << "Numarul de pixeli al 1: ";
                std::cout << root->countPixels('w') << std::endl;
                std::cout << root->countPixels('b') << std::endl;
                std::cout << "Numarul de pixeli al 2: ";
                std::cout << root2->countPixels('w') << std::endl;
                std::cout << root2->countPixels('b') << std::endl;
                std::cout << "Numarul de pixeli al 3: ";
                std::cout << root3->countPixels('w') << std::endl;
                std::cout << root3->countPixels('b') << std::endl;
                goto start;
            case 'c':
                Node::deleteTree(root);
                Node::deleteTree(root2);
                Node::deleteTree(root3);
                goto ULTRASTART;
            }

            break;

        case 2:
            std::cout << "Introduceti preorder-ul 1: ";
            std::cin >> s;
            std::cout << "Introduceti preorder-ul 2: ";
            std::cin >> s2;

            index = 0;
            Node *root4 = Node::buildTree(s, index, 1024);

            index = 0;
            Node *root5 = Node::buildTree(s2, index, 1024);

            index = 0;
            Node *root6 = Node::overlay(root4, root5, index);

        start2:
            char option3;
            std::cout << "Selectati:\n d pentru a afisa preorder-ul\n e pentru numarul de pixeli\nf pentru a iesi:\n";
            std::cin >> option3;

            switch (option3)
            {
            case 'd':
                std::cout << "Preorder-ul 1: ";
                root4->printTree();
                std::cout << std::endl;
                std::cout << "Preorder-ul 2: ";
                root5->printTree();
                std::cout << std::endl;
                std::cout << "Preorder-ul 3: ";
                root6->printTree();
                std::cout << std::endl;
                goto start2;
            case 'e':
                std::cout << "Numarul de pixeli al 1: ";
                std::cout << root4->countPixels('w') << std::endl;
                std::cout << root4->countPixels('b') << std::endl;
                std::cout << "Numarul de pixeli al 2: ";
                std::cout << root5->countPixels('w') << std::endl;
                std::cout << root5->countPixels('b') << std::endl;
                std::cout << "Numarul de pixeli al 3: ";
                std::cout << root6->countPixels('w') << std::endl;
                std::cout << root6->countPixels('b') << std::endl;
                goto start2;
            case 'f':
                Node::deleteTree(root4);
                Node::deleteTree(root5);
                Node::deleteTree(root6);
                goto ULTRASTART;
            }
        }

        break;
    }
}
