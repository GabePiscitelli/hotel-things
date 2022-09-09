import java.util.ArrayList;
//creates the class that has room numbers and a list of guests
public class HotelRoom{
    int roomnum;
    ArrayList<person> guests = new ArrayList<person>();
    public HotelRoom(int num) {
        roomnum = num;
       
    }
    //if there are more than two guests don't check in, otherwise check them in
    public void checkin(person a) {
        if(guests.size() >= 2){
            System.out.println("room full");
        }
        else{
            guests.add(a);
            System.out.println(a.name + " checked into room " + roomnum);
        }
    }
    //remove the specified guest from the guest list
    public void checkout(person a){
        guests.remove(a);
        System.out.println(a.name + " checked out of room " + roomnum);
    }
    //if the room has two people say its full, otherwise say it has room
    public void CheckCapacity(){
        if(guests.size() >= 2){
            System.out.println("room " + roomnum + " is full");
        } else {
            System.out.println("room " + roomnum + " has room");
        }
    }
    //print the attributes of the specified guest in the specified room
    public void printGuestInfo(person a){
        System.out.println("name: " + a.name + " height: " + a.height + " age: " + a.age + " hair color: " + a.haircolor);
    }







}