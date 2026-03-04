#include<iostream>
#include<fstream>

using namespace std;

int main(){ 

    ifstream myfile("some.txt");
    string file_content;
    
    // myfile>>file_content;
    // getline(myfile,file_content);

    // cout<<"file content: "<<file_content<<endl;
    
    
    while(getline(myfile,file_content)){
        
        cout<<"file content: "<<file_content<<endl;
    }


    myfile.close();

    return 0;
}