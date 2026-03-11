#include <iostream>

using namespace std;

int main()
{
    try
    {

        int num1;
        cout << "Enter number 1: ";
        cin >> num1;
        int num2;
        cout << "Enter number 2: ";
        cin >> num2;

        if (num1 == 0 || num2 == 0)
        {
            throw 101;
        }

        cout << "result: " << num1 / num2 << endl;
    }
    catch (int e)
    {
        // cout << "some error occure" << endl;

        if (e==101)
        {
            cout<<"you cant divied by zero\n";
        }
        else{
            cout<<"some error found\n";
        }
    }
    
    cout << "operation successfull completed..\n";

    return 0;
}