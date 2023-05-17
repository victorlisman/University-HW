#include <iostream>
#include <string>
#include <array>

class Node
{
private:
    char val;
    Node *topLeft;
    Node *topRight;
    Node *bottomLeft;
    Node *bottomRight;
    int pixels;

public:
    Node(char c) : val(c), topLeft(nullptr), topRight(nullptr), bottomLeft(nullptr), bottomRight(nullptr), pixels(0) {}

    static Node *buildTree(std::string &s, int &index, int pixels)
    {
        if (index >= s.size())
            return nullptr;
        Node *root = new Node(s[index]);
        root->pixels = pixels;
        if (s[index] == 'p')
        {
            index++;
            root->topLeft = buildTree(s, index, pixels / 4);
            index++;
            root->topRight = buildTree(s, index, pixels / 4);
            index++;
            root->bottomLeft = buildTree(s, index, pixels / 4);
            index++;
            root->bottomRight = buildTree(s, index, pixels / 4);
        }
        return root;
    }

    void printTree()
    {
        printTree(this);
    }

    static void printTree(Node *root)
    {
        if (root == nullptr)
            return;

        std::cout << root->val;
        printTree(root->topLeft);
        printTree(root->topRight);
        printTree(root->bottomLeft);
        printTree(root->bottomRight);
    }

    int countPixels(char c)
    {
        return countPixels(this, c);
    }

    static int countPixels(Node *root, char c)
    {
        if (root == nullptr)
            return 0;
        if (root->val == c)
            return root->pixels;
        return countPixels(root->topLeft, c) + countPixels(root->topRight, c) + countPixels(root->bottomLeft, c) + countPixels(root->bottomRight, c);
    }

    static std::string preorderTraversal(Node *root1, Node *root2)
    {
        if (root1 == nullptr && root2 == nullptr)
            return "";
        if (root1 == nullptr)
            return std::string(1, root2->val) + preorderTraversal(nullptr, root2->topLeft) + preorderTraversal(nullptr, root2->topRight) + preorderTraversal(nullptr, root2->bottomLeft) + preorderTraversal(nullptr, root2->bottomRight);
        if (root2 == nullptr)
            return std::string(1, root1->val) + preorderTraversal(root1->topLeft, nullptr) + preorderTraversal(root1->topRight, nullptr) + preorderTraversal(root1->bottomLeft, nullptr) + preorderTraversal(root1->bottomRight, nullptr);
        if (root1->val == 'b' || root2->val == 'b')
            return "b";
        if (root1->val == 'w' && root2->val == 'w')
            return "w";
        return "p" + preorderTraversal(root1->topLeft, root2->topLeft) + preorderTraversal(root1->topRight, root2->topRight) + preorderTraversal(root1->bottomLeft, root2->bottomLeft) + preorderTraversal(root1->bottomRight, root2->bottomRight);
    }

    static Node *overlay(Node *root1, Node *root2, int &index)
    {
        std::string s = preorderTraversal(root1, root2);
        return buildTree(s, index, 1024);
    }

    static void deleteTree(Node *root)
    {
        if (root == nullptr)
            return;
        deleteTree(root->topLeft);
        deleteTree(root->topRight);
        deleteTree(root->bottomLeft);
        deleteTree(root->bottomRight);
        delete root;
    }
};