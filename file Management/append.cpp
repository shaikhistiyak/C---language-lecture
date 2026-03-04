#include<iostream>
#include<fstream>

using namespace std;

int main(){
    ofstream myfile("user.txt",ios::app);

    string id;
    cout<<"Enter your id here: ";
    // cin>>id;
    getline(cin,id);

    myfile<<endl<<id;

    myfile.close();

    return 0;
}