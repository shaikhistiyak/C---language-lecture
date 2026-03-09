#include<iostream>

using namespace std;


template <typename Datatype>
class Math{
    
    public:

    Datatype sum(Datatype num1,Datatype num2){
        cout<<num1+num2<<endl;
        
    }


};

template <typename Datatype1,typename Datatype2>
class Maths{
    
    public:

    void sum(Datatype1 num1,Datatype2 num2){
        cout<<num1+num2<<endl;
    }


};

int main(){

    // Math obj;
    Math<int> obj;
    obj.sum(34,34);
    obj.sum(56,545);
   

    Maths<int,long long>objs;

    objs.sum(34,345345634);


    return 0;
}