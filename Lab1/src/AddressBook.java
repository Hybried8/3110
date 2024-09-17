import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> buds;

    public AddressBook() {
        buds = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo bud){
        buds.add(bud);
    }

    public void removeBuddy(){

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(addressBook);
    }
}
