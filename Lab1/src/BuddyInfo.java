public class BuddyInfo {
    /*
    The constructor class for BuddyInfo, implemented using the generate function
     */
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /*
    The getter for name, used the generate function
     */
    public String getName() {
        return name;
    }

    public static void main(String[] args){
        /*
        buddyInfo instantiator
         */
        BuddyInfo buddy = new BuddyInfo("Me", "huh","000")     ;
        System.out.println("Hello " + buddy.getName());
    }

}
