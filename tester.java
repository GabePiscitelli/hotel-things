public class tester{
    public static void main(String[] args) {
        person guest1 = new person(2.0, 27, "Bob", "brown");
        person guest2 = new person(1.8, 40, "Joe", "blond");
        HotelRoom room1 = new HotelRoom(1);
        //HotelRoom room2 = new HotelRoom(2);
        room1.checkin(guest1);
        room1.checkin(guest2);
        room1.CheckCapacity();
        room1.printGuestInfo(guest2);
        room1.checkout(guest1);
   }



}