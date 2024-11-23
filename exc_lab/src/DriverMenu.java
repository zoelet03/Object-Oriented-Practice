public class DriverMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            menu.displayMenuOption(1);
            menu.displayMenuOption(2);
            menu.displayMenuOption(3);
            menu.displayMenuOption(4);
        } catch(InvalidOptionException e) {
            //catch and handle exception
            System.out.println(e.getMessage());// Output for the error messsage
        }

    }

}

