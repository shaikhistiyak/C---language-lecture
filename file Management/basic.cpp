#include<iostream>
#include<fstream>

using namespace std;

int main(){

/*
fstream is file management libary 
contains three class:
1.ofstream used to create files or append file
2.ifstream used to read file
3.fstream is inheritaed by ofstream and ifstream 

oftream objectname("filename");


objectname<<"msg";


objectname.close();
*/


ofstream myfile("some.txt");

string userinput;
cout<<"Enter what you want to enter : ";
// cin>>userinput;
getline(cin,userinput);

myfile<<userinput<<endl;

// myfile<<"i am creating using c++ language\n";
// myfile<<"something went to be come for futher update\n";

myfile.close();

return 0;


}

