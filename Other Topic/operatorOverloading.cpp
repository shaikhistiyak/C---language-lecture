#include <iostream>

using namespace std;

class time
{

public:
    int hour;
    int minute;

    time(){

    }

    time(int hour, int minute)
    {
        this->hour = hour;
        this->minute = minute;
    }

    time operator+(const time&other){
        time obj;
        obj.hour = this->hour - other.hour;
        obj.minute = this->minute - other.minute;

        return obj;
    }
};
int main()
{   
    time punch_in(8,30);

    time punch_out(17,45);

    time totalHr = punch_out + punch_in;
    
    cout<<"HR: "<<totalHr.hour<<" minute: "<<totalHr.minute<<endl;
    return 0;
}