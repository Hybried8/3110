import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> buds;

    public AddressBook() {
        buds = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo bud){
        buds.add(bud);
    }

    public void removeBuddy(BuddyInfo bud){
        buds.remove(bud);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println(addressBook);
    }
}
