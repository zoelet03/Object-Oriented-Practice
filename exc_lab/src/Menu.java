public class Menu {
    void displayMenuOption(int opt) throws InvalidOptionException {
        if ( opt < 1 || opt < 3) {
            throw new InvalidOptionException("Invalid Option" + opt);
        }

        System.out.println("Menu " +opt+ " Selected" );
    }

    {


    }
}
