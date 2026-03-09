#include <iostream>

using namespace std;

class car
{
private:
    double price;

public:

    car(double price){
        this->price = price;
    }


    // double getprice(){
    //     return this->price;
    // }
    friend void onRoadPrice(car Car);
};

void onRoadPrice(car Car)
{
    
    // cout << "On Road Price: " << (Car.getprice() + 10 + 10 + 10) << endl;
    cout << "On Road Price: " << (Car.price + 10 + 10 + 10) << endl;
}

int main()
{
    car skoda(1);
    

    onRoadPrice(skoda);
    return 0;
}