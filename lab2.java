class vehicle{

    void wheel(){
        System.out.println("Vehicle has wheels");
    }

    void horn(){
        System.out.println("Vehicle has horns");
    }
}

class bike extends vehicle{

}

class car extends vehicle{

}

public class lab2{
    public static void main(String[]  args){

        bike b1 = new bike();
        b1.wheel();
        b1.horn();

        car c1 =  new car();
        c1.wheel();
        c1.horn();

    }
}