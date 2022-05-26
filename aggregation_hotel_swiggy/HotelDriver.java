
import java.util.Scanner;

class HotelDriver {

    public  static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Hotel h = new Hotel(100, "Charcoal", "jigga");
        boolean exit=true;
        while(exit) {
            System.out.println("\n1.Book order\n2.Swiggy details\n3.Hotel Deatils\n4.Cancel order\n5.Exit\nEnter your choice:");
            int ch =s.nextInt();
            switch(ch)
            {
                case 1:
                    h.bookOrder();
                    break;
                case 2:
                    h.showSwiggyDetails();
                    break;
                case 3:
                    h.showHotelDetails();
                    break;
                case 4:
                    h.cancleOrder();
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
